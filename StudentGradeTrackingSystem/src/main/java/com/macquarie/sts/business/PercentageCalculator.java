package main.java.com.macquarie.sts.business;

import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;

/**
 * This interface is define method to calculate the percentage of a student
 * 
 *
 */
public interface PercentageCalculator {

	/**
	 * this method would take a student object and calculate the percentage of
	 * student
	 * 
	 * @param student
	 * @param teacher
	 * @return
	 */
	double calculatePercentage(final Student student,final Teacher teacher);

}
