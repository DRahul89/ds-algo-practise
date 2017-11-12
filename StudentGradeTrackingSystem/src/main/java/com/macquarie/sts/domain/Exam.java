package main.java.com.macquarie.sts.domain;

/**
 * 
 * This class contains the all required information for exams
 *
 */
public class Exam extends BaseDomain {

	private String examName;

	private double marksOfExam;

	private String teacherID;

	public String getExamID() {
		return this.getDomainID();
	}

	public void setExamID(String examID) {
		this.setDomainID(examID);
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public double getMarksOfExam() {
		return marksOfExam;
	}

	public void setMarksOfExam(double marksOfExam) {
		this.marksOfExam = marksOfExam;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

}
