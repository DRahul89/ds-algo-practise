package com.sapient.wellington.investmentstrategy.dto;

import java.util.ArrayList;
import java.util.List;

import com.sapient.wellington.investmentstrategy.domain.Attribute;

/**
 * A DTO which will contain the attribute information
 * 
 *
 */
public class AttributeDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2641418195424660719L;

	private String attributeName;

	private long attributeID;

	private int totalReturn;

	private List<AttributeDTO> attributes = new ArrayList<>();

	private List<SecurityDTO> securities = new ArrayList<>();

	private String attributeType;

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public long getAttributeID() {
		return attributeID;
	}

	public void setAttributeID(long attributeID) {
		this.attributeID = attributeID;
	}

	public List<AttributeDTO> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeDTO> attributes) {
		this.attributes = attributes;
	}

	public int getTotalReturn() {
		return totalReturn;
	}

	public void setTotalReturn(int totalReturn) {
		this.totalReturn = totalReturn;
	}

	public List<SecurityDTO> getSecurities() {
		return securities;
	}

	public void setSecurities(List<SecurityDTO> securities) {
		this.securities = securities;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public Attribute convertDtoToDao() {
		Attribute attribute = new Attribute();
		attribute.setId(this.getAttributeID());
		attribute.setAttributeType(this.getAttributeType());
		return attribute;
	}

}
