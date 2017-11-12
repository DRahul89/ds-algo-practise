package src.main.java.behavioral.ChainOfResponsibility;

/**
 * 
 * A Client class which will show the demo of chain of responsibility
 * 
 */
public class Client {

	private static final Integer REQUEST = 0;

	public static void main(String[] args) {
		final Chain positive = new PositiveNumber();
		final Chain negative = new NegativeNumber();
		final Chain zero = new ZeroNumber();
		negative.setNext(positive);
		positive.setNext(zero);
		final Number number = new Number(REQUEST);
		negative.process(number);
	}
}
