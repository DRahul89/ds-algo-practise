package main.java.com.macquarie.sts.service;

import main.java.com.macquarie.sts.dao.TeacherDao;
import main.java.com.macquarie.sts.domain.Teacher;

/**
 * An implementation for teacher service interface
 * 
 */
public class TeacherServiceImpl implements TeacherService {
	/**
	 * An object for teacher DAO
	 */
	private TeacherDao teacherDao;

	public TeacherServiceImpl(final TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return (Teacher) teacherDao.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher, String teacherID) {
		return (Teacher) teacherDao.update(teacher, teacherID);
	}

	@Override
	public void deleteTeacher(String teacherID) {
		teacherDao.delete(teacherID);

	}

	@Override
	public Teacher getTeacher(String teacherID) {
		return (Teacher) teacherDao.get(teacherID);
	}

	@Override
	public Teacher updateAssignmentPercentage(double assignmentPercentage, String teacherID) {
		Teacher teacher = (Teacher) teacherDao.get(teacherID);
		teacher.setPercentAllocationForAssignment(assignmentPercentage);
		return teacher;
	}

	@Override
	public Teacher updateExamPercentage(double examPercentage, String teacherID) {
		Teacher teacher = (Teacher) teacherDao.get(teacherID);
		teacher.setPercentAllocationForExam(examPercentage);
		return teacher;
	}

	@Override
	public Teacher updateExtraCreditPercentage(double creditPercentage, String teacherID) {
		Teacher teacher = (Teacher) teacherDao.get(teacherID);
		teacher.setPercentAllocationForExtraCreditAssignment(creditPercentage);
		return teacher;
	}

}
