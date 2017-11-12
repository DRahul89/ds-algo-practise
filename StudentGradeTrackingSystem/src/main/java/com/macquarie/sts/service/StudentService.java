package main.java.com.macquarie.sts.service;

import main.java.com.macquarie.sts.domain.Assignment;
import main.java.com.macquarie.sts.domain.Exam;
import main.java.com.macquarie.sts.domain.Student;

/**
 * 
 * This interface define all the functionality required for students
 *
 */
public interface StudentService {

	/**
	 * This method would add one new student to the system
	 * 
	 * @param teacher
	 *            an object contain teachers information
	 * @return saved Teacher object
	 */
	Student addStudent(final Student student);

	/**
	 * This method would update student to the system
	 * 
	 * @param student
	 *            an object contain student information
	 * @return saved student object
	 */
	Student updateStudent(final Student student, final String studentID);

	/**
	 * This method would delete the student from the system
	 * 
	 * @param studentID
	 *            an id of student needs to be deleted
	 */
	void deleteStudent(final String studentID);

	/**
	 * This method would fetch the student info from the system
	 * 
	 * @param studentID
	 *            an id of student needs to be deleted
	 * 
	 * @return {@link Student}
	 */
	Student getStudent(final String studentID);

	/**
	 * This method would update the extra credit assignment info of a student in
	 * to system
	 * 
	 * @param isCompleted
	 *            true if done
	 */
	void updateExtraCreditAssignmnetInfo(final Boolean isCompleted, final String studentID);

	/**
	 * This method would add a new assignment info to student profile
	 * 
	 * @param studentID
	 * @param assignment
	 */
	void addAssignmentInfo(final String studentID, final Assignment assignment);

	/**
	 * This method would add a new exam info to student profile
	 * 
	 * @param studentID
	 * @param exam
	 */
	void addExamInfo(final String studentID, final Exam exam);

	/**
	 * This method returns the student average grade in percentage
	 * 
	 * @param studentID
	 *            id of the student
	 * @return the value in percentage for avg assignment grade
	 */
	double getStudentGrade(final String studentID,final String teacherID);

}
