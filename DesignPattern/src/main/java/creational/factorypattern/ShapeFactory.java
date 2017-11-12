package src.main.java.creational.factorypattern;

/**
 * 
 * This Factory class will return the Object of type provided
 * 
 */
public class ShapeFactory {

	public final static String TRIANGLE = "Triangle";

	public final static String RECTANGLE = "Rectangle";

	/**
	 * This method will return the Shape object on the basis of shape type
	 * 
	 * @param shapeType
	 *            Type of shape which object needed
	 * @param height
	 *            height of shape
	 * @param width
	 *            width of shape
	 * @return Object of specific shape Implementation class
	 */
	public static Shape getShape(final String shapeType, final Long height, final Long width) {
		Shape shape = null;
		if (TRIANGLE.equals(shapeType)) {
			shape = new Triangle(height, width);
		} else {
			shape = new Rectangle(height, width);
		}
		return shape;
	}

}
