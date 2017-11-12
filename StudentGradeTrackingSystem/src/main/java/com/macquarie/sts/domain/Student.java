package main.java.com.macquarie.sts.domain;

import java.util.List;

/**
 * 
 * This class contains the all required information of student
 *
 */
public class Student extends BaseDomain {

	private String studentName;

	private List<Assignment> assignments;

	private List<Exam> exams;

	private double assignmentPercentage;

	private double examPercentage;

	private boolean extraCreditAssignmentDone;

	private double studentGrade;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentID() {
		return this.getDomainID();
	}

	public void setStudentID(String studentID) {
		this.setDomainID(studentID);
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public double getAssignmentPercentage() {
		return assignmentPercentage;
	}

	public void setAssignmentPercentage(double assignmentPercentage) {
		this.assignmentPercentage = assignmentPercentage;
	}

	public double getExamPercentage() {
		return examPercentage;
	}

	public void setExamPercentage(double examPercentage) {
		this.examPercentage = examPercentage;
	}

	public boolean isExtraCreditAssignmentDone() {
		return extraCreditAssignmentDone;
	}

	public void setExtraCreditAssignmentDone(boolean extraCreditAssignmentDone) {
		this.extraCreditAssignmentDone = extraCreditAssignmentDone;
	}

	public double getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(double studentGrade) {
		this.studentGrade = studentGrade;
	}

}
