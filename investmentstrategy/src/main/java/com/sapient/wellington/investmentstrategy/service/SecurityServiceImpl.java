package com.sapient.wellington.investmentstrategy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.wellington.investmentstrategy.business.ClassificationFacade;
import com.sapient.wellington.investmentstrategy.dto.InputDTO;
import com.sapient.wellington.investmentstrategy.dto.OutputDTO;

/**
 * 
 * An implementation for {@link SecurityService}
 *
 */
@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private ClassificationFacade ClassificationFacade;

	public OutputDTO getClassifiedData(InputDTO inputDTO) {
		// TODO Auto-generated method stub
		return ClassificationFacade.getClassificationForRequest(inputDTO);
	}

}
