package main.java.com.macquarie.sts.business;

import java.util.List;

import main.java.com.macquarie.sts.domain.Assignment;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;



/**
 * 
 * This class would calculate the percentage of student in assignments
 *
 */
public class AssignmentPercentageCalculater implements PercentageCalculator {

	@Override
	public double calculatePercentage(Student student, Teacher teacher) {
		double assignmentPercentage = 0.0;
		double totalAssignmentMarks = 0.0;
		List<Assignment> assignments = student.getAssignments();
		if (null != assignments && !assignments.isEmpty()) {
			for (Assignment assignment : assignments) {
				totalAssignmentMarks = totalAssignmentMarks + assignment.getMarksOfAssignment();
			}
			assignmentPercentage = totalAssignmentMarks / assignments.size();
		}
		if (student.isExtraCreditAssignmentDone()) {
			assignmentPercentage = assignmentPercentage + teacher.getPercentAllocationForExtraCreditAssignment();
		}
		return assignmentPercentage;
	}

}
