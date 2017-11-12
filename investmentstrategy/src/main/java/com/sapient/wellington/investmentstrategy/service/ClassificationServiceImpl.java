package com.sapient.wellington.investmentstrategy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.wellington.investmentstrategy.domain.Classification;
import com.sapient.wellington.investmentstrategy.dto.ClassificationDTO;
import com.sapient.wellington.investmentstrategy.repository.ClassificationRepository;

/**
 * 
 * An implementation for {@link ClassificationService}
 *
 */
@Service
@Transactional
public class ClassificationServiceImpl implements ClassificationService {

	@Autowired
	private ClassificationRepository classificationRepository;

	@Override
	public ClassificationDTO saveClassification(ClassificationDTO classificationDTO) {
		Classification classification = classificationRepository.save(classificationDTO.convertDtoToDao());
		return null != classification ? classification.convertDaoToDTo() : null;
	}

	@Override
	public ClassificationDTO getClassification(final Long classificationId) {
		Classification classification = classificationRepository.findOne(classificationId);
		return classification.convertDaoToDTo();
	}

	@Override
	public void deleteClassification(long classificationId) {
		classificationRepository.delete(classificationId);

	}

}
