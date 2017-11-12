package src.main.java.behavioral.command;

/**
 * 
 * This class will implement the Order interface execute method for defining the
 * Buy operation on request
 * 
 */
public class BuyStock implements Order {
	/**
	 * Contains a Request wrapper object on which operation will be performed in
	 * this case it is a Stock class object
	 */
	private Stock abcStock;

	public BuyStock(final Stock abcStock) {
		this.abcStock = abcStock;
	}
	/**
	 * Execute the buy operation on request
	 */
	public void execute() {
		abcStock.buy();

	}

}
