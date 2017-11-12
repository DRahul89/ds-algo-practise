package com.sapient.wellington.investmentstrategy.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.wellington.investmentstrategy.dto.AttributeDTO;
import com.sapient.wellington.investmentstrategy.service.AttributeService;
/**
 * 
 *A rest service for attribute resource
 *
 */
@RestController
@RequestMapping(value = "/attribute")
public class AttributeResource {

	@Autowired
	private AttributeService attributeService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody AttributeDTO addAttribute(@RequestBody AttributeDTO attributeDTO) {
		return attributeService.saveAttribute(attributeDTO);
	}
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public void deleteAttribute(@PathVariable int id) {
		attributeService.deleteAttribute(id);
	}
}
