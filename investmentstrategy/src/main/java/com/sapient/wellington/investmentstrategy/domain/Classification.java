package com.sapient.wellington.investmentstrategy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sapient.wellington.investmentstrategy.dto.ClassificationDTO;

/**
 * 
 * A model class for representing the classification
 *
 */
@Entity
@Table(name = "classification")
public class Classification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8963440059118760093L;

	public Classification() {
		// TODO Auto-generated constructor stub
	}

	@Id
	private long id;

	@Column(name = "classification")
	private String classification;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public ClassificationDTO convertDaoToDTo() {
		ClassificationDTO classificationDTO = new ClassificationDTO();
		classificationDTO.setClassificationID(this.getId());
		classificationDTO.setClassification(this.getClassification());
		return classificationDTO;
	}

}
