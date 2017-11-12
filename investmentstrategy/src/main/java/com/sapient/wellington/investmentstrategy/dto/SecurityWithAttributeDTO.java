package com.sapient.wellington.investmentstrategy.dto;

import java.util.List;
/**
 * A DTO which will contain the security information with attribute
 * 
 *
 */
public class SecurityWithAttributeDTO extends BaseDTO {

	private List<AttributeDTO> attributes;

	private int returnValue;

	private String securityName;

	public List<AttributeDTO> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeDTO> attributes) {
		this.attributes = attributes;
	}

	public int getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(int returnValue) {
		this.returnValue = returnValue;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public AttributeDTO getAttributeWithId(final long attributeId) {
		if (null != attributes) {
			for (AttributeDTO attributeDTO : attributes) {
				if (attributeDTO.getAttributeID() == attributeId)
					return attributeDTO;
			}
		}
		return null;
	}

	public SecurityDTO getSecurityDTO() {
		SecurityDTO securityDTO = new SecurityDTO();
		securityDTO.setReturnValue(this.getReturnValue());
		securityDTO.setSecurityName(this.getSecurityName());
		return securityDTO;
	}

}
