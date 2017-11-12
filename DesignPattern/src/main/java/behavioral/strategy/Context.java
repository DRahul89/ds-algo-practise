package src.main.java.behavioral.strategy;

/**
 * 
 * It is a context object by which we can change the strategy at run times
 * 
 */
public class Context {
	/**
	 * contains the reference of strategy
	 */
	private Strategy strategy;

	public Context(final Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(final int firstNumber,final int secondNumber) {
		return strategy.doOperation(firstNumber, secondNumber);
	}
}