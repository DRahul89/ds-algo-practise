package src.main.java.behavioral.template;

/**
 * 
 * A client for testing the HouseTemplate Design Pattern
 * 
 */
public class HousingClient {

	private static final String SEPERATOR = "************";

	public static void main(String[] args) {

		HouseTemplate houseType = new WoodenHouse();

		houseType.buildHouse();
		System.out.println(SEPERATOR);

		houseType = new GlassHouse();

		houseType.buildHouse();
	}

}
