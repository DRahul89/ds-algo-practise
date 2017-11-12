package com.sapient.wellington.investmentstrategy.dto;

import com.sapient.wellington.investmentstrategy.domain.Classification;

/**
 * 
 * A DTO class for representing the classification
 *
 */
public class ClassificationDTO extends BaseDTO {

	private int totalReturn;

	private long classificationID;

	private String classification;


	public int getTotalReturn() {
		return totalReturn;
	}

	public void setTotalReturn(int totalReturn) {
		this.totalReturn = totalReturn;
	}

	public long getClassificationID() {
		return classificationID;
	}

	public void setClassificationID(long classificationID) {
		this.classificationID = classificationID;
	}

	

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public Classification convertDtoToDao() {
		Classification classification = new Classification();
		classification.setId(this.getClassificationID());
		classification.setClassification(this.getClassification());
		return classification;
	}

}
