package main.java.com.macquarie.sts.business;

import java.util.List;

import main.java.com.macquarie.sts.domain.Exam;
import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;



/**
 * 
 * This class would calculate the percentage of student in exams
 *
 */
public class ExamPercentageCalculator implements PercentageCalculator {

	@Override
	public double calculatePercentage(Student student, Teacher teacher) {
		double examPercentage = 0.0;
		double totalExamMarks = 0.0;
		List<Exam> exams = student.getExams();
		if (null != exams && !exams.isEmpty()) {
			for (Exam exam : exams) {
				totalExamMarks = totalExamMarks + exam.getMarksOfExam();
			}
			examPercentage = totalExamMarks / exams.size();
		}
		return examPercentage;
	}

}
