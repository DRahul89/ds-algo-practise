package src.main.java.behavioral.template;

/**
 * 
 * A sub class for HouseTemplate Glass house define its own walls and pillar
 * build methods
 * 
 */
public class GlassHouse extends HouseTemplate {
	/**
	 * constant for building walls
	 */
	private static final String BUILD_WALLS_MESSAGE = "Building Glass Walls.";
	/**
	 * constant for building pillers
	 */
	private static final String BUILD_PILLER_MESSAGE = "Building Pillars with glass coating.";

	@Override
	public void buildWalls() {
		System.out.println(BUILD_WALLS_MESSAGE);
	}

	@Override
	public void buildPillars() {
		System.out.println(BUILD_PILLER_MESSAGE);
	}

}