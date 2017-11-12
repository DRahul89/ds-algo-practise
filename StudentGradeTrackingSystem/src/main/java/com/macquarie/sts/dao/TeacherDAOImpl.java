package main.java.com.macquarie.sts.dao;

import java.util.concurrent.ConcurrentHashMap;

import main.java.com.macquarie.sts.domain.BaseDomain;
import main.java.com.macquarie.sts.domain.Teacher;



/**
 * A class which implements the Teacher DAO and provide the implementation for
 * all required operations
 * 
 *
 */
public class TeacherDAOImpl implements TeacherDao {

	private ConcurrentHashMap<String, Teacher> teachersMap = new ConcurrentHashMap<>();

	@Override
	public BaseDomain save(final BaseDomain baseDomain) {
		Teacher teacher = null;
		if (baseDomain instanceof Teacher) {
			teacher = (Teacher) baseDomain;
			teachersMap.put(baseDomain.getDomainID(), teacher);
		}
		return teacher;
	}

	@Override
	public BaseDomain update(final BaseDomain baseDomain, final String id) {
		Teacher teacher = null;
		if (baseDomain instanceof Teacher) {
			teacher = (Teacher) baseDomain;
			teachersMap.put(id, teacher);
		}
		return teacher;
	}

	@Override
	public void delete(final String id) {
		teachersMap.remove(id);

	}

	@Override
	public BaseDomain get(final String id) {
		return teachersMap.get(id);
	}

}
