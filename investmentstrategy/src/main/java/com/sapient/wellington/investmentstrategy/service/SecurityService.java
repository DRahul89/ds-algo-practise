package com.sapient.wellington.investmentstrategy.service;

import org.springframework.stereotype.Service;

import com.sapient.wellington.investmentstrategy.dto.InputDTO;
import com.sapient.wellington.investmentstrategy.dto.OutputDTO;

/**
 * 
 * An interface which define the methods for security service
 *
 */
@Service
public interface SecurityService {
	
	public OutputDTO getClassifiedData(final InputDTO inputDTO);

}
