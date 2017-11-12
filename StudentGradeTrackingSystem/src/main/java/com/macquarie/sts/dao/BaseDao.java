package main.java.com.macquarie.sts.dao;

import main.java.com.macquarie.sts.domain.BaseDomain;

/**
 * A generic class which would contain the all basic operation which are self
 * explanatory
 * 
 *
 */
public interface BaseDao {

	BaseDomain save(final BaseDomain baseDomain);

	BaseDomain update(final BaseDomain baseDomain, final String id);

	void delete(final String id);

	BaseDomain get(final String id);

}
