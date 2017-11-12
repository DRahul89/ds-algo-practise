package src.main.java.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * A class which will collect all the commands from clients and execute it
 * 
 */
public class Broker {
	/**
	 * Contains the List of commands
	 */
	private List<Order> orderList = new ArrayList<Order>();

	/**
	 * This method is used for collecting a command request
	 * 
	 * @param order
	 */
	public void takeOrder(final Order order) {
		orderList.add(order);
	}

	/**
	 * This method will execute the defined operation on command request
	 */
	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}