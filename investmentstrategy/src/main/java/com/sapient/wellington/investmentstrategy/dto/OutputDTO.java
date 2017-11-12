package com.sapient.wellington.investmentstrategy.dto;

import java.util.List;

/**
 * 
 * A DTO for recieving Output data
 *
 */
public class OutputDTO extends BaseDTO {

	private List<AttributeDTO> attributeDTOs;

	private int totalReturn;

	public int getTotalReturn() {
		return totalReturn;
	}

	public void setTotalReturn(int totalReturn) {
		this.totalReturn = totalReturn;
	}

	public List<AttributeDTO> getAttributeDTOs() {
		return attributeDTOs;
	}

	public void setAttributeDTOs(List<AttributeDTO> attributeDTOs) {
		this.attributeDTOs = attributeDTOs;
	}

}
