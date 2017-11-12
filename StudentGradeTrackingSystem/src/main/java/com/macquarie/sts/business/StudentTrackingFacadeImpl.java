package main.java.com.macquarie.sts.business;

import main.java.com.macquarie.sts.constant.ApplicationConstants;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;

/**
 * An implementation for {@link StudentTrackingFacade}
 * 
 *
 */
public class StudentTrackingFacadeImpl implements StudentTrackingFacade {

	private PercentageCalculator percentageCalculator;

	@Override
	public double calculateStudentGrade(Student student, Teacher teacher) {
		double grade = 0.0;
		percentageCalculator = new AssignmentPercentageCalculater();
		double assignmentPercentage = percentageCalculator.calculatePercentage(student, teacher);
		percentageCalculator = new ExamPercentageCalculator();
		double examPercentage = percentageCalculator.calculatePercentage(student, teacher);
		if (examPercentage == 0) {
			return assignmentPercentage;
		} else {
			grade = (assignmentPercentage * teacher.getPercentAllocationForAssignment()) / ApplicationConstants.HUNDRED
					+ (examPercentage * teacher.getPercentAllocationForExam()) / ApplicationConstants.HUNDRED;
		}
		return grade;
	}

}
