package src.main.java.behavioral.ChainOfResponsibility;

/**
 * 
 * A wrapper class for the request of chain of responsibility
 * 
 */
public class Number {
	/**
	 * contain a positive,zero or negative number for request
	 */
	private int number;

	public Number(final int number) {
		this.number = number;
	}

	/**
	 * @return the number
	 */
	protected int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	protected void setNumber(final int number) {
		this.number = number;
	}

}
