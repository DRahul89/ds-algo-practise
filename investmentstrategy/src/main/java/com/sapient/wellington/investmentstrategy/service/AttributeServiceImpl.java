package com.sapient.wellington.investmentstrategy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.wellington.investmentstrategy.domain.Attribute;
import com.sapient.wellington.investmentstrategy.dto.AttributeDTO;
import com.sapient.wellington.investmentstrategy.repository.AttributeRepositroy;

/**
 * 
 *An implementation for {@link AttributeService}
 *
 */
@Service
@Transactional
public class AttributeServiceImpl implements AttributeService {

	@Autowired
	private AttributeRepositroy attributeRepositroy;

	@Override
	public void deleteAttribute(long attribteId) {
		attributeRepositroy.delete(attribteId);

	}

	@Override
	public AttributeDTO saveAttribute(AttributeDTO attributeDTO) {
		Attribute attribute = attributeRepositroy.save(attributeDTO.convertDtoToDao());
		return null != attribute ? attribute.convertDaoToDTo() : null;
	}

}
