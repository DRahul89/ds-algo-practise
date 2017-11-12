package com.sapient.wellington.investmentstrategy.service;

import com.sapient.wellington.investmentstrategy.dto.AttributeDTO;

/**
 * 
 * An interface which define the methods for attribute service
 *
 */
public interface AttributeService {
	/**
	 * a function to save the state of attribute in repository
	 * 
	 * @param attributeDTO
	 *            {@link AttributeDTO}
	 * @return attributeDTO
	 */
	public AttributeDTO saveAttribute(final AttributeDTO attributeDTO);

	/**
	 * a function to delete the state of attribute resource for given id
	 * 
	 * @param attributeId
	 *            id of attribute which we need to delete
	 */
	public void deleteAttribute(final long attributeId);

}
