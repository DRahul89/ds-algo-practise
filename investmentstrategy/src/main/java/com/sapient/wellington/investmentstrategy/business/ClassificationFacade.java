package com.sapient.wellington.investmentstrategy.business;

import org.springframework.stereotype.Component;

import com.sapient.wellington.investmentstrategy.dto.InputDTO;
import com.sapient.wellington.investmentstrategy.dto.OutputDTO;

/**
 * 
 * A facade for investment classification system
 *
 */
@Component
public interface ClassificationFacade {
	/**
	 * This method would return the request data in form of defined
	 * classification
	 * 
	 * @param inputDTO
	 *            {@link InputDTO}
	 * @return {@link OutputDTO}
	 */
	public OutputDTO getClassificationForRequest(final InputDTO inputDTO);
}
