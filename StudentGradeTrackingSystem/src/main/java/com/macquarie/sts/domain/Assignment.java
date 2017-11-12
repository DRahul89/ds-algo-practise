package main.java.com.macquarie.sts.domain;

/**
 * 
 * This class contains the all required information for assignments
 *
 */
public class Assignment extends BaseDomain {

	private String assignmentName;

	private double marksOfAssignment;

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public String getAssignmentID() {
		return this.getDomainID();
	}

	public void setAssignmentID(String assignmentID) {
		this.setDomainID(assignmentID);
	}

	public double getMarksOfAssignment() {
		return marksOfAssignment;
	}

	public void setMarksOfAssignment(double marksOfAssignment) {
		this.marksOfAssignment = marksOfAssignment;
	}

}
