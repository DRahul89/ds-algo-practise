package src.main.java.behavioral.ChainOfResponsibility;

/**
 * 
 * This class object in the chain will process all the request for negative
 * number
 * 
 */
public class NegativeNumber implements Chain {

	/**
	 * Zero number
	 */
	private static final Integer ZERO = 0;

	/**
	 * Used for processing the request
	 */
	private static final String DESCRIPTION = "A Negative Number";
	/**
	 * contains the reference of next object in chain
	 */
	private Chain nextInChain;

	@Override
	public void setNext(final Chain nextInChain) {
		this.nextInChain = nextInChain;

	}

	@Override
	public void process(final Number request) {
		if (request.getNumber() < ZERO) {
			System.out.println(new StringBuilder(DESCRIPTION + " "
					+ request.getNumber()));
		} else {
			nextInChain.process(request);
		}

	}
}
