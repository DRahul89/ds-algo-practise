package src.main.java.behavioral.command;

/**
 * 
 * A class which will wrap the command request object with all defined
 * operations which can be perform on this request
 * 
 */
public class Stock {
	/**
	 * Defined the Name of product
	 */
	private String name = "ABC";
	/**
	 * Defined the quantity of product
	 */
	private int quantity = 10;

	/**
	 * A method which will buy a product from stock
	 */
	public void buy() {
		System.out.println(new StringBuilder(CommandConstants.STOCK_NAME + name
				+ CommandConstants.STOCK_QUANTITY + quantity
				+ CommandConstants.BUY_DESC));
	}

	/**
	 * A method which will sell a product from stock
	 */
	public void sell() {
		System.out.println(new StringBuilder(CommandConstants.STOCK_NAME + name
				+ CommandConstants.STOCK_QUANTITY + quantity
				+ CommandConstants.SOLD_DESC));
	}

}
