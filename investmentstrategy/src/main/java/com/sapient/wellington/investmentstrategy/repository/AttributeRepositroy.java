package com.sapient.wellington.investmentstrategy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.wellington.investmentstrategy.domain.Attribute;

/**
 * 
 * A data base repository class for attributes
 *
 */
@Repository
public interface AttributeRepositroy extends JpaRepository<Attribute, Long> {

}
