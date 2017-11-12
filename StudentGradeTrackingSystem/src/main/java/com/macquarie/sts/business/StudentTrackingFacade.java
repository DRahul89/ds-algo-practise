package main.java.com.macquarie.sts.business;

import main.java.com.macquarie.sts.domain.Student;
import main.java.com.macquarie.sts.domain.Teacher;

/**
 * A facade for student tracking system
 * 
 *
 */
public interface StudentTrackingFacade {
	/**
	 * this method would calculate the grade for student
	 * 
	 * @param student
	 * @param teacher
	 * @return
	 */
	double calculateStudentGrade(final Student student, final Teacher teacher);

}
