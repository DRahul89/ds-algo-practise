package com.sapient.wellington.investmentstrategy.dto;

/**
 * 
 * /** A DTO which will contain the security information without its attribute
 * 
 *
 *
 */
public class SecurityDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2150540008267472475L;

	private int returnValue;

	private String securityName;

	public int getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(int returnValue) {
		this.returnValue = returnValue;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

}
