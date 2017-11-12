package com.sapient.wellington.investmentstrategy.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.wellington.investmentstrategy.dto.ClassificationDTO;
import com.sapient.wellington.investmentstrategy.service.ClassificationService;
/**
 * 
 *A rest service for classification resource
 *
 */
@RestController
@RequestMapping(value = "/classification")
public class ClassificationResource {

	@Autowired
	private ClassificationService classificationService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody ClassificationDTO addClassification(@RequestBody ClassificationDTO classificationDTO) {
		return classificationService.saveClassification(classificationDTO);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody ClassificationDTO getClassification(@PathVariable Long id) {
		return classificationService.getClassification(id);
	}

	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public void deleteClassification(@PathVariable int id) {
		classificationService.deleteClassification(id);
	}

}
