package main.test.com.macquarie.sts.business;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.java.com.macquarie.sts.business.ExamPercentageCalculator;
import main.java.com.macquarie.sts.business.PercentageCalculator;
import main.java.com.macquarie.sts.domain.Exam;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;


/**
 * 
 * Test class for {@link ExamPercentageCalculator}
 *
 */
public class ExamPercentageCalculatorTest {

	private PercentageCalculator percentageCalculator;

	private Student student;

	private Teacher teacher;

	@Before
	public void populatetestData() {
		this.student = createStudent();
		this.teacher = createTeacher();
		percentageCalculator = new ExamPercentageCalculator();

	}

	private Teacher createTeacher() {
		Teacher teacher = new Teacher();
		teacher.setPercentAllocationForExtraCreditAssignment(2);
		return teacher;
	}

	private Student createStudent() {
		Student student = new Student();
		List<Exam> exams = new ArrayList<>();
		Exam firstExam = new Exam();
		firstExam.setExamName("firstExam");
		firstExam.setMarksOfExam(85);
		exams.add(firstExam);
		Exam secondExam = new Exam();
		secondExam.setExamName("secondExam");
		secondExam.setMarksOfExam(88);
		exams.add(secondExam);
		student.setExams(exams);
		return student;
	}

	@Test
	public void calculateStudentExamPercentageWithExams() {
		double examPercentage = percentageCalculator.calculatePercentage(student, teacher);
		Assert.assertEquals(examPercentage, 86.5);
	}

	@Test
	public void calculateStudentExamPercentageWithoutExams() {
		this.student.setExams(null);
		double assignmentPercentage = percentageCalculator.calculatePercentage(student, teacher);
		Assert.assertEquals(assignmentPercentage,0.0);
	}

}
