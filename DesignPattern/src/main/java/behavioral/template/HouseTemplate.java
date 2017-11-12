package src.main.java.behavioral.template;

/**
 * 
 * A template class defining the order of steps for Building a House
 * 
 */
public abstract class HouseTemplate {
	/**
	 * Constant for Build house description
	 */
	private static final String BUILD_HOUSE_MESSAGE = "House is built.";
	/**
	 * Constant for Build window description
	 */
	private static final String BUILD_WINDOW_MESSAGE = "Building Glass Windows.";
	/**
	 * Constant for Build foundations description
	 */
	private static final String BUILD_FOUNDATION_MESSAGE = "Building foundation with cement,iron rods and sand";

	/**
	 * A final Template method for building a complete house so that subclasses
	 * can't override
	 */
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println(BUILD_HOUSE_MESSAGE);
	}

	/**
	 * This method will build the Windows of house
	 */
	public void buildWindows() {
		System.out.println(BUILD_WINDOW_MESSAGE);
	}

	/**
	 * This method will build the walls of house
	 */
	public abstract void buildWalls();

	/**
	 * This method will build the pillars
	 */
	public abstract void buildPillars();

	/**
	 * This method will Build the Foundation for house
	 */
	private void buildFoundation() {
		System.out.println(BUILD_FOUNDATION_MESSAGE);
	}
}
