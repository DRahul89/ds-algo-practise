package com.sapient.wellington.investmentstrategy.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.sapient.wellington.investmentstrategy.dto.AttributeDTO;
import com.sapient.wellington.investmentstrategy.dto.ClassificationDTO;
import com.sapient.wellington.investmentstrategy.dto.InputDTO;
import com.sapient.wellington.investmentstrategy.dto.OutputDTO;
import com.sapient.wellington.investmentstrategy.dto.SecurityWithAttributeDTO;
import com.sapient.wellington.investmentstrategy.service.ClassificationService;

@RunWith(MockitoJUnitRunner.class)
public class ClassificationFacadeTest {
	
	@Mock
	private ClassificationService cassificationService;
	
	@InjectMocks
	private ClassificationFacadeImpl classificationFacade;

	private InputDTO inputDTO = null;

	@Before
	public void populateTestData() {
		inputDTO = new InputDTO();
		inputDTO.setClassificationId(1);
		List<SecurityWithAttributeDTO> SecurityWithAttributeDTOs = new ArrayList<>();
		SecurityWithAttributeDTO firstSecuirty = new SecurityWithAttributeDTO();
		List<AttributeDTO> attributeDTOs = new ArrayList<>();
		AttributeDTO firstAttributeDTO = new AttributeDTO();
		firstAttributeDTO.setAttributeID(1);
		firstAttributeDTO.setAttributeName("FIxed Income");
		attributeDTOs.add(firstAttributeDTO);
		AttributeDTO secAttributeDTO = new AttributeDTO();
		secAttributeDTO.setAttributeID(2);
		secAttributeDTO.setAttributeName("US");
		attributeDTOs.add(secAttributeDTO);
		AttributeDTO thirdAttributeDTO = new AttributeDTO();
		thirdAttributeDTO.setAttributeID(3);
		thirdAttributeDTO.setAttributeName("COMODITY");
		attributeDTOs.add(thirdAttributeDTO);
		firstSecuirty.setAttributes(attributeDTOs);
		firstSecuirty.setSecurityName("A");
		firstSecuirty.setReturnValue(10);
		SecurityWithAttributeDTOs.add(firstSecuirty);
		SecurityWithAttributeDTO secondSecuirty = new SecurityWithAttributeDTO();
		secondSecuirty.setAttributes(attributeDTOs);
		secondSecuirty.setSecurityName("B");
		secondSecuirty.setReturnValue(15);
		SecurityWithAttributeDTOs.add(secondSecuirty);
		inputDTO.setSecurityDTOs(SecurityWithAttributeDTOs);

		addThirdService(SecurityWithAttributeDTOs, firstAttributeDTO, secAttributeDTO);
	}

	private void addThirdService(List<SecurityWithAttributeDTO> SecurityWithAttributeDTOs,
			AttributeDTO firstAttributeDTO, AttributeDTO secAttributeDTO) {
		SecurityWithAttributeDTO thirdSecuirty = new SecurityWithAttributeDTO();
		List<AttributeDTO> thirdattributeDTOs = new ArrayList<>();
		thirdattributeDTOs.add(firstAttributeDTO);
		thirdattributeDTOs.add(secAttributeDTO);
		AttributeDTO fourthAttributeDTO = new AttributeDTO();
		fourthAttributeDTO.setAttributeID(3);
		fourthAttributeDTO.setAttributeName("TECHNOLOGY");
		thirdattributeDTOs.add(fourthAttributeDTO);
		thirdSecuirty.setAttributes(thirdattributeDTOs);
		thirdSecuirty.setSecurityName("C");
		thirdSecuirty.setReturnValue(15);
		SecurityWithAttributeDTOs.add(thirdSecuirty);
		inputDTO.setSecurityDTOs(SecurityWithAttributeDTOs);
	}

	@Test
	public void getClassificationForRequestWithDifferentOrderTest() {
		ClassificationDTO classificationDTO = new ClassificationDTO();
		classificationDTO.setClassification("321");
		when(cassificationService.getClassification(1l)).thenReturn(classificationDTO);
		OutputDTO outputDTO = classificationFacade.getClassificationForRequest(inputDTO);
		assertEquals(outputDTO.getAttributeDTOs().size(), 2);
		assertEquals(outputDTO.getTotalReturn(), 80);

	}
	
	@Test
	public void getTotalReturnTest() {
		ClassificationDTO classificationDTO = new ClassificationDTO();
		classificationDTO.setClassification("213");
		when(cassificationService.getClassification(1l)).thenReturn(classificationDTO);
		OutputDTO outputDTO = classificationFacade.getClassificationForRequest(inputDTO);
		assertEquals(outputDTO.getAttributeDTOs().size(), 1);
		assertEquals(outputDTO.getTotalReturn(), 40);

	}

}
