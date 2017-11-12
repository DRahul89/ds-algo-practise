package main.java.com.macquarie.sts.domain;

/**
 * 
 * This class contains the all required information of teacher
 *
 */
public class Teacher extends BaseDomain {

	private String teacherName;

	private double percentAllocationForAssignment;

	private double percentAllocationForExam;

	private double percentAllocationForExtraCreditAssignment;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherID() {
		return this.getDomainID();
	}

	public void setTeacherID(String teacherID) {
		this.setDomainID(teacherID);
	}

	public double getPercentAllocationForAssignment() {
		return percentAllocationForAssignment;
	}

	public void setPercentAllocationForAssignment(double percentAllocationForAssignment) {
		this.percentAllocationForAssignment = percentAllocationForAssignment;
	}

	public double getPercentAllocationForExam() {
		return percentAllocationForExam;
	}

	public void setPercentAllocationForExam(double percentAllocationForExam) {
		this.percentAllocationForExam = percentAllocationForExam;
	}

	public double getPercentAllocationForExtraCreditAssignment() {
		return percentAllocationForExtraCreditAssignment;
	}

	public void setPercentAllocationForExtraCreditAssignment(double percentAllocationForExtraCreditAssignment) {
		this.percentAllocationForExtraCreditAssignment = percentAllocationForExtraCreditAssignment;
	}

}
