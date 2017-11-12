package src.main.java.behavioral.strategy;

/**
 * 
 * This class contains the algorithm for multiply operation
 * 
 */
public class MultiplyOperation implements Strategy {
	/**
	 * Perform the multiply operation
	 */
	@Override
	public int doOperation(final int first,final int second) {
		return first * second;
	}

}
