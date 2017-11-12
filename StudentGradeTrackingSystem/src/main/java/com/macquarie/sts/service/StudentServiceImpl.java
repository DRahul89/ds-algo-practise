package main.java.com.macquarie.sts.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.macquarie.sts.business.StudentTrackingFacade;
import main.java.com.macquarie.sts.dao.StudentDao;
import main.java.com.macquarie.sts.dao.TeacherDao;
import main.java.com.macquarie.sts.domain.Assignment;
import main.java.com.macquarie.sts.domain.Exam;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;

/**
 * An implementation for student service interface
 * 
 */
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	private TeacherDao teacherDao;

	private StudentTrackingFacade studentTrackingFacade;

	public StudentServiceImpl(final StudentDao studentDao, final StudentTrackingFacade studentTrackingFacade,
			final TeacherDao teacherDao) {
		this.studentDao = studentDao;
		this.studentTrackingFacade = studentTrackingFacade;
		this.teacherDao = teacherDao;
	}

	@Override
	public Student addStudent(Student student) {
		return (Student) studentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student, String studentID) {
		return (Student) studentDao.update(student, studentID);
	}

	@Override
	public void deleteStudent(String studentID) {
		studentDao.delete(studentID);

	}

	@Override
	public Student getStudent(String studentID) {
		return (Student) studentDao.get(studentID);

	}

	@Override
	public void updateExtraCreditAssignmnetInfo(Boolean isCompleted, String studentID) {
		Student student = (Student) studentDao.get(studentID);
		student.setExtraCreditAssignmentDone(isCompleted);
	}

	@Override
	public void addAssignmentInfo(String studentID, Assignment assignment) {
		Student student = (Student) studentDao.get(studentID);
		List<Assignment> assignments = student.getAssignments();
		if (null != assignments) {
			assignments.add(assignment);
		} else {
			assignments = new ArrayList<Assignment>();
			assignments.add(assignment);
			student.setAssignments(assignments);
		}

	}

	@Override
	public void addExamInfo(String studentID, Exam exam) {
		Student student = (Student) studentDao.get(studentID);
		List<Exam> exams = student.getExams();
		if (null != exams) {
			exams.add(exam);
		} else {
			exams = new ArrayList<Exam>();
			exams.add(exam);
			student.setExams(exams);
		}

	}

	@Override
	public double getStudentGrade(String studentID, String techerID) {
		Student student = (Student) studentDao.get(studentID);
		Teacher teacher = (Teacher) teacherDao.get(techerID);
		return studentTrackingFacade.calculateStudentGrade(student, teacher);
	}

}
