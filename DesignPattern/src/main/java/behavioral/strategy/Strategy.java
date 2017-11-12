package src.main.java.behavioral.strategy;

/**
 * 
 * Interface strategy for all king of strategies will implements its doOperation
 * method accordingly
 * 
 */
public interface Strategy {
	/**
	 * Perform the Operation 
	 * @param first
	 * @param second
	 * @return
	 */
	int doOperation(final int first, final int second);
}
