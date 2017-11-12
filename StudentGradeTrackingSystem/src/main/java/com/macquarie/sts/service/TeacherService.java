package main.java.com.macquarie.sts.service;

import main.java.com.macquarie.sts.domain.Teacher;

/**
 * 
 * This interface define all the functionality required for teachers
 *
 */
public interface TeacherService {
	/**
	 * This method would add one new teacher to the system
	 * 
	 * @param teacher
	 *            an object contain teachers information
	 * @return saved Teacher object
	 */
	Teacher addTeacher(final Teacher teacher);

	/**
	 * This method would update teacher info to the system
	 * 
	 * @param teacher
	 *            an object contain teachers information
	 * @param teacherID
	 * @return updated Teacher object
	 */
	Teacher updateTeacher(final Teacher teacher, final String teacherID);

	/**
	 * This method would add one new teacher to the system
	 * 
	 * @param teacherID
	 *            contains teacher ID information
	 */
	void deleteTeacher(final String teacherID);

	/**
	 * This method would fetch teacher info from the system
	 * 
	 * @param teacherID
	 *            an object contain teachers information
	 * @return saved Teacher object
	 */
	Teacher getTeacher(final String teacherID);

	/**
	 * This method would add the assignment percentage allocation for the
	 * mentioned teacher id
	 * 
	 * @param assignmentPercentage
	 * @param teacherID
	 * @return
	 */
	Teacher updateAssignmentPercentage(final double assignmentPercentage, final String teacherID);

	/**
	 * This method would add the exam percentage allocation for the mentioned
	 * teacher id
	 * 
	 * @param assignmentPercentage
	 * @param teacherID
	 * @return
	 */
	Teacher updateExamPercentage(final double examPercentage, final String teacherID);

	/**
	 * This method would add the extra credit assignment percentage allocation
	 * for the mentioned teacher id
	 * 
	 * @param examPercentage
	 * @param teacherID
	 * @return
	 */
	Teacher updateExtraCreditPercentage(final double creditPercentage, final String teacherID);
}
