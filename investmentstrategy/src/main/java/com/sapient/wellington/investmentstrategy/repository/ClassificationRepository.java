package com.sapient.wellington.investmentstrategy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.wellington.investmentstrategy.domain.Classification;

/**
 * 
 * A data base repository class for classification
 *
 */
@Repository
public interface ClassificationRepository extends JpaRepository<Classification, Long>{
 

}
