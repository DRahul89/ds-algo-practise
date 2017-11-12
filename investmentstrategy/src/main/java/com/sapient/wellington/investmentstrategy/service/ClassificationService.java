package com.sapient.wellington.investmentstrategy.service;

import com.sapient.wellington.investmentstrategy.dto.ClassificationDTO;

/**
 * 
 * An interface which define the methods for classification service
 *
 */
public interface ClassificationService {
	/**
	 * A function which save the classification in repository
	 * 
	 * @param classificationDTO
	 *            {@link ClassificationDTO}
	 * @return
	 */
	public ClassificationDTO saveClassification(final ClassificationDTO classificationDTO);

	/**
	 * A get function to get the state of classification resource
	 * 
	 * @param classificationId
	 *            id of classification resource
	 * @return
	 */
	public ClassificationDTO getClassification(final Long classificationId);

	/**
	 * a function to delete the resource state from repository
	 * 
	 * @param classificationId
	 *            id of classification resource
	 */
	public void deleteClassification(final long classificationId);
}
