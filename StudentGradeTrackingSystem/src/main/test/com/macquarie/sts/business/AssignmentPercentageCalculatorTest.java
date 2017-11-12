package main.test.com.macquarie.sts.business;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.java.com.macquarie.sts.business.AssignmentPercentageCalculater;
import main.java.com.macquarie.sts.business.PercentageCalculator;
import main.java.com.macquarie.sts.domain.Assignment;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;

/**
 * 
 * Test class for {@link AssignmentPercentageCalculater}
 *
 */

public class AssignmentPercentageCalculatorTest {

	private PercentageCalculator percentageCalculator;

	private Student student;

	private Teacher teacher;

	@Before
	public void populatetestData() {
		this.student = createStudent();
		this.teacher = createTeacher();
		percentageCalculator = new AssignmentPercentageCalculater();

	}

	private Teacher createTeacher() {
		Teacher teacher = new Teacher();
		teacher.setPercentAllocationForExtraCreditAssignment(2);
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
		return student;
	}

	@Test
	public void calculateStudentAssignmentPercentageWithoutExtraCredit() {
		double assignmentPercentage = percentageCalculator.calculatePercentage(student, teacher);
		Assert.assertEquals(assignmentPercentage, 86.5);
	}

	@Test
	public void calculateStudentAssignmentPercentageWithExtraCredit() {
		this.student.setExtraCreditAssignmentDone(Boolean.TRUE);
		double assignmentPercentage = percentageCalculator.calculatePercentage(student, teacher);
		Assert.assertEquals(assignmentPercentage, 88.5);
	}
}
