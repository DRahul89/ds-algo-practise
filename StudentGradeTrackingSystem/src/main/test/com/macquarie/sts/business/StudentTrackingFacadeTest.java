package main.test.com.macquarie.sts.business;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.java.com.macquarie.sts.business.StudentTrackingFacade;
import main.java.com.macquarie.sts.business.StudentTrackingFacadeImpl;
import main.java.com.macquarie.sts.domain.Assignment;
import main.java.com.macquarie.sts.domain.Exam;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;



/**
 * 
 * Test class for {@link StudentTrackingFacade}
 *
 */
public class StudentTrackingFacadeTest {

	private StudentTrackingFacade studentTrackingFacade;

	private Student student;

	private Teacher teacher;

	@Before
	public void populatetestData() {
		this.student = createStudent();
		this.teacher = createTeacher();
		studentTrackingFacade = new StudentTrackingFacadeImpl();

	}

	private Teacher createTeacher() {
		Teacher teacher = new Teacher();
		teacher.setPercentAllocationForExtraCreditAssignment(2);
		teacher.setPercentAllocationForAssignment(10.1);
		teacher.setPercentAllocationForExam(89.9);
		return teacher;
	}

	private Student createStudent() {
		Student student = new Student();
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
	public void calculateStudentGradeTestWithoutExtraCredit() {
		double assignmentPercentage = studentTrackingFacade.calculateStudentGrade(student, teacher);
		Assert.assertEquals(assignmentPercentage,90.7306,.01);
	}
	
	@Test
	public void calculateStudentGradeTestWithExtraCredit() {
		this.student.setExtraCreditAssignmentDone(Boolean.TRUE);
		double assignmentPercentage = studentTrackingFacade.calculateStudentGrade(student, teacher);
		Assert.assertEquals(assignmentPercentage, 90.93,.01);
	}
}
