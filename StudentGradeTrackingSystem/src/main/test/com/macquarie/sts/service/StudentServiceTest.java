package main.test.com.macquarie.sts.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.java.com.macquarie.sts.business.StudentTrackingFacade;
import main.java.com.macquarie.sts.business.StudentTrackingFacadeImpl;
import main.java.com.macquarie.sts.dao.StudentDAOImpl;
import main.java.com.macquarie.sts.dao.StudentDao;
import main.java.com.macquarie.sts.dao.TeacherDAOImpl;
import main.java.com.macquarie.sts.dao.TeacherDao;
import main.java.com.macquarie.sts.domain.Assignment;
import main.java.com.macquarie.sts.domain.Exam;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;
import main.java.com.macquarie.sts.service.StudentService;
import main.java.com.macquarie.sts.service.StudentServiceImpl;
import main.java.com.macquarie.sts.service.TeacherService;
import main.java.com.macquarie.sts.service.TeacherServiceImpl;

/**
 * A test class for {@link StudentService}
 *
 */
public class StudentServiceTest {

	private StudentService studentService;

	private StudentDao studentDao;

	private Student student;

	private TeacherService teacherService;

	private TeacherDao teacherDao;

	private Teacher teacher;
	
	private StudentTrackingFacade studentTrackingFacade;

	@Before
	public void populatetestData() {
		this.student = createStudent();
		this.studentDao = new StudentDAOImpl();
		this.studentTrackingFacade = new StudentTrackingFacadeImpl();
		this.teacher = createTeacher();
		this.teacherDao = new TeacherDAOImpl();
		this.studentService = new StudentServiceImpl(studentDao,studentTrackingFacade,teacherDao);
		teacherService = new TeacherServiceImpl(teacherDao);

	}

	private Teacher createTeacher() {
		Teacher teacher = new Teacher();
		teacher.setTeacherID("1234");
		teacher.setPercentAllocationForAssignment(10.1);
		teacher.setPercentAllocationForExam(89.9);
		teacher.setPercentAllocationForExtraCreditAssignment(2);
		return teacher;
	}

	private Student createStudent() {
		Student student = new Student();
		student.setStudentID("1234");
		List<Assignment> assignments = new ArrayList<>();
		Assignment firstAssignment = new Assignment();
		firstAssignment.setAssignmentName("firstAssignment");
		firstAssignment.setMarksOfAssignment(85);
		assignments.add(firstAssignment);
		Assignment secondAssignment = new Assignment();
		secondAssignment.setAssignmentName("secondAssignment");
		secondAssignment.setMarksOfAssignment(88);
		assignments.add(secondAssignment);
		student.setAssignments(assignments);
		Assignment thirdAssignment = new Assignment();
		thirdAssignment.setAssignmentName("thirdAssignment");
		thirdAssignment.setMarksOfAssignment(92);
		assignments.add(thirdAssignment);
		student.setAssignments(assignments);
		List<Exam> exams = new ArrayList<>();
		Exam firstExam = new Exam();
		firstExam.setExamName("firstExam");
		firstExam.setMarksOfExam(91);
		exams.add(firstExam);
		student.setExams(exams);
		return student;
	}

	@Test
	public void createStudentTest() {
		studentService.addStudent(student);
		Student studObj = studentService.getStudent(student.getStudentID());
		Assert.assertNotNull(studObj);
		Assert.assertEquals(studObj.getStudentID(), "1234");

	}

	@Test
	public void updateStudentTest() {
		studentService.addStudent(student);
		student.setStudentName("Bob");
		Student studObj = studentService.getStudent(student.getStudentID());
		Assert.assertEquals(studObj.getStudentName(), "Bob");

	}

	@Test
	public void deleteStudentTest() {
		studentService.addStudent(student);
		studentService.deleteStudent(student.getStudentID());
		Student studObj = studentService.getStudent(student.getStudentID());
		Assert.assertNull(studObj);

	}

	@Test
	public void getStudentGradeTest() {
		student.setExtraCreditAssignmentDone(Boolean.TRUE);
		studentService.addStudent(student);
		teacherService.addTeacher(teacher);
		double studentGrade = studentService.getStudentGrade(student.getStudentID(), teacher.getTeacherID());
		Assert.assertEquals(studentGrade, 90.93,.1);

	}

}
