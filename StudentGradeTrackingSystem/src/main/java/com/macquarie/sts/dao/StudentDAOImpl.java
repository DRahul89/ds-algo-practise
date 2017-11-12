package main.java.com.macquarie.sts.dao;

import java.util.concurrent.ConcurrentHashMap;

import main.java.com.macquarie.sts.domain.BaseDomain;
import main.java.com.macquarie.sts.domain.Student;





public class StudentDAOImpl implements StudentDao {

	private ConcurrentHashMap<String, Student> studentsMap = new ConcurrentHashMap<>();

	@Override
	public BaseDomain save(BaseDomain baseDomain) {
		Student student = null;
		if (baseDomain instanceof Student) {
			student = (Student) baseDomain;
			studentsMap.put(baseDomain.getDomainID(), student);
		}
		return student;
	}

	@Override
	public BaseDomain update(BaseDomain baseDomain, String id) {
		Student student = null;
		if (baseDomain instanceof Student) {
			student = (Student) baseDomain;
			studentsMap.put(id, student);
		}
		return student;
	}

	@Override
	public void delete(String id) {
		studentsMap.remove(id);

	}

	@Override
	public BaseDomain get(String id) {
		return studentsMap.get(id);
	}

}
