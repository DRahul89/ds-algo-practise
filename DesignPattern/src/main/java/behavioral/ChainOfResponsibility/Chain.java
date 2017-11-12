package src.main.java.behavioral.ChainOfResponsibility;

/**
 * 
 * This interface defined the necessary methods for the classes which will make
 * a chain structure
 * 
 */
public interface Chain {
	/**
	 * This method is used for linking a object to its next object in the chain
	 * of objects
	 * 
	 * @param nextInChain
	 *            is the reference for the next object in chain
	 */
	void setNext(final Chain nextInChain);

	/**
	 * This method will process the request if the request will be the
	 * responsibility of this class object
	 * 
	 * @param request
	 *            coming data as a request
	 */
	void process(final Number request);
}
