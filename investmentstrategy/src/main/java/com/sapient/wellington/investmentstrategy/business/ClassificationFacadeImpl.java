package com.sapient.wellington.investmentstrategy.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.wellington.investmentstrategy.dto.AttributeDTO;
import com.sapient.wellington.investmentstrategy.dto.ClassificationDTO;
import com.sapient.wellington.investmentstrategy.dto.InputDTO;
import com.sapient.wellington.investmentstrategy.dto.OutputDTO;
import com.sapient.wellington.investmentstrategy.dto.SecurityDTO;
import com.sapient.wellington.investmentstrategy.dto.SecurityWithAttributeDTO;
import com.sapient.wellington.investmentstrategy.service.ClassificationService;

/**
 * An implementation of {@link ClassificationFacade}
 *
 */

@Component
public class ClassificationFacadeImpl implements ClassificationFacade {

	@Autowired
	private ClassificationService cassificationService;

	public OutputDTO getClassificationForRequest(final InputDTO inputDTO) {
		OutputDTO outputDTO = new OutputDTO();
		List<AttributeDTO> outputDTos = new ArrayList<>();
		ClassificationDTO classificationDTO = cassificationService.getClassification(inputDTO.getClassificationId());
		String classification = classificationDTO.getClassification();
		AttributeDTO parentAttributeDTO = null;
		int classLength = classification.length();
		List<SecurityWithAttributeDTO> securityDTos = inputDTO.getSecurityDTOs();
		if (null != securityDTos) {
			for (SecurityWithAttributeDTO securityyDTO : securityDTos) {
				List<AttributeDTO> childDTOs = outputDTos;
				int count = 0;
				while (count < classLength) {
					AttributeDTO attributeDTO = securityyDTO
							.getAttributeWithId(Integer.parseInt(classification.charAt(count) + ""));
					if (null == attributeDTO) {
						addNAAttribute(securityyDTO, childDTOs);
						break;
					}
					parentAttributeDTO = checkIfExists(attributeDTO, childDTOs);
					if (null != parentAttributeDTO) {
						attributeDTO = parentAttributeDTO;
					} else {
						parentAttributeDTO = attributeDTO;
						childDTOs.add(attributeDTO);
					}
					childDTOs = parentAttributeDTO.getAttributes();
					if (count == classLength - 1) {
						attributeDTO.getSecurities().add(securityyDTO.getSecurityDTO());
					}
					count++;
				}

			}
			outputDTO.setTotalReturn(calculateTotalReturn(outputDTos));
			outputDTO.setAttributeDTOs(outputDTos);
		}
		return outputDTO;
	}

	/**
	 * This method is a helper method used for adding a NA attribute
	 * 
	 * @param securityyDTO
	 * @param childDTOs
	 */
	private void addNAAttribute(SecurityWithAttributeDTO securityyDTO, List<AttributeDTO> childDTOs) {
		AttributeDTO naAttribute = new AttributeDTO();
		naAttribute.setAttributeName("NA");
		naAttribute.getSecurities().add(securityyDTO.getSecurityDTO());
		childDTOs.add(naAttribute);
	}

	/**
	 * This method is a helper method used to find the attribute in attribute
	 * list for output data
	 * 
	 * @param attributeDTO
	 * @param outputDTos
	 * @return
	 */
	private static AttributeDTO checkIfExists(AttributeDTO attributeDTO, List<AttributeDTO> outputDTos) {
		if (null != outputDTos) {
			for (AttributeDTO attributeDTo : outputDTos) {
				if (attributeDTo.getAttributeName().equals(attributeDTO.getAttributeName()))
					return attributeDTo;
			}
		}
		return null;
	}

	/**
	 * This method is most imp helper method used for the calculation of total
	 * 
	 * @param attributeDTOs
	 * @return
	 */
	private int calculateTotalReturn(final List<AttributeDTO> attributeDTOs) {
		int totalReturn = 0;
		if (null != attributeDTOs) {
			for (AttributeDTO attributeDTO : attributeDTOs) {
				if (attributeDTO.getAttributes().isEmpty()) {
					int securityTotal = 0;
					List<SecurityDTO> securityDTOs = attributeDTO.getSecurities();
					if (null != securityDTOs) {
						for (SecurityDTO securityDTO : securityDTOs) {
							securityTotal = securityTotal + securityDTO.getReturnValue();
						}
					}
					attributeDTO.setTotalReturn(securityTotal);
					totalReturn = totalReturn + securityTotal;
				} else {
					attributeDTO.setTotalReturn(calculateTotalReturn(attributeDTO.getAttributes()));
					totalReturn = totalReturn + attributeDTO.getTotalReturn();
				}
			}
		}
		return totalReturn;
	}

	
}
