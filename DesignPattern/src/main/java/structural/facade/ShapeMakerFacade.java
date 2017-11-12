package src.main.java.structural.facade;

/**
 * 
 * A single Unified interface for facade design pattern
 * 
 */
public class ShapeMakerFacade {
	/**
	 * Contains the reference of shape
	 */
	private Shape shape;

	public ShapeMakerFacade(String shapeType) {
		createShapeObject(shapeType);
	}

	/**
	 * Draw the shape for shape type
	 */
	public void drawShape() {
		shape.draw();
	}

	/**
	 * Create the object of provided shape type
	 * 
	 * @param shapeType
	 *            is the type of shape
	 */
	private void createShapeObject(String shapeType) {
		if (FacadeConstants.TRIANGLE.equals(shapeType)) {
			shape = new Triangle();
		} else if (FacadeConstants.RECTANGLE.equals(shapeType)) {
			shape = new Rectangle();
		} else {
			shape = new Square();
		}
	}

}
