package com.sapient.wellington.investmentstrategy.dto;

import java.util.List;

/**
 * A DTO for recieving input data
 *
 *
 */
public class InputDTO extends BaseDTO {

	private long classificationId;

	private List<SecurityWithAttributeDTO> securityDTOs;

	public long getClassificationId() {
		return classificationId;
	}

	public void setClassificationId(long classificationId) {
		this.classificationId = classificationId;
	}

	public List<SecurityWithAttributeDTO> getSecurityDTOs() {
		return securityDTOs;
	}

	public void setSecurityDTOs(List<SecurityWithAttributeDTO> securityDTOs) {
		this.securityDTOs = securityDTOs;
	}

}
