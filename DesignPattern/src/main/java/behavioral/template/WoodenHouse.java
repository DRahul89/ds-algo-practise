package src.main.java.behavioral.template;

/**
 * 
 * A sub class for HouseTemplate wooden house define its own walls and pillar 
 * build methods
 * 
 */
public class WoodenHouse extends HouseTemplate {
	/**
	 * constant for building walls 
	 */
	private static final String BUILD_WALLS_MESSAGE = "Building Wooden Walls.";
	/**
	 * constant for building pillers 
	 */
	private static final String BUILD_PILLER_MESSAGE = "Building Pillars with Wood coating.";

	@Override
	public void buildWalls() {
		System.out.println(BUILD_WALLS_MESSAGE);
	}

	@Override
	public void buildPillars() {
		System.out.println(BUILD_PILLER_MESSAGE);
	}

}
