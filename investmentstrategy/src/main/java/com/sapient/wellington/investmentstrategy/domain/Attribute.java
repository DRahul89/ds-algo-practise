package com.sapient.wellington.investmentstrategy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sapient.wellington.investmentstrategy.dto.AttributeDTO;

/**
 * A model class for representing the attribute
 *
 */
@Entity
@Table(name = "attribute")
public class Attribute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8963440059118760093L;

	public Attribute() {
		// TODO Auto-generated constructor stub
	}

	@Id
	private long id;

	@Column(name = "attribute_type")
	private String attributeType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public AttributeDTO convertDaoToDTo() {
		AttributeDTO attributeDTO = new AttributeDTO();
		attributeDTO.setAttributeID(this.getId());
		return attributeDTO;
	}
}
