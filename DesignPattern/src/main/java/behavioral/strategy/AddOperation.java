package src.main.java.behavioral.strategy;

/**
 * 
 * This class contains the algorithm for add operation
 * 
 */
public class AddOperation implements Strategy {
	/**
	 * Perform the add operation
	 */
	@Override
	public int doOperation(final int first, final int second) {
		return first + second;

	}

}
