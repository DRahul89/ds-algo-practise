package main.java.com.metro.exceptions;

public class BalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorMsg;

	public BalanceException(final String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
