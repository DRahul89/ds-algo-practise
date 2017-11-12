package src.main.java.behavioral.command;

/**
 * 
 * This class will implement the Order interface execute method for defining the
 * Sell operation on request
 * 
 */
public class SellStock implements Order {
	/**
	 * Contains a Request wrapper object on which operation will be performed in
	 * this case it is a Stock class object
	 */
	private Stock abcStock;

	public SellStock(final Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * Execute the sell operation on request
	 */
	public void execute() {
		abcStock.sell();

	}
}
