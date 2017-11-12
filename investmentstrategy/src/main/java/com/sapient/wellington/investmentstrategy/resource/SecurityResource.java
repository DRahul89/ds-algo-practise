package com.sapient.wellington.investmentstrategy.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.wellington.investmentstrategy.dto.InputDTO;
import com.sapient.wellington.investmentstrategy.dto.OutputDTO;
import com.sapient.wellington.investmentstrategy.service.SecurityService;
/**
 * 
 *A rest service for security resource
 *
 */
@RestController
@RequestMapping(value = "/security")
public class SecurityResource {

	@Autowired
	private SecurityService securityService;

	@RequestMapping(value = "/getClassified", method = RequestMethod.PATCH)
	public @ResponseBody OutputDTO getClassifiedData(@RequestBody InputDTO inputDTO) {
		return securityService.getClassifiedData(inputDTO);
	}

}
