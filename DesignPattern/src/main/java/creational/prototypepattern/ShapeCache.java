package src.main.java.creational.prototypepattern;

import java.util.Hashtable;

/**
 * 
 * A class which will cache the shape Data
 * 
 */
public class ShapeCache {
	/**
	 * A constant for string one
	 */
	public static final String ONE = "1";
	/**
	 * A constant for string two
	 */
	public static final String TWO = "2";
	/**
	 * A constant for string three
	 */
	public static final String THREE = "3";
	/**
	 * A map for caching the shape data
	 */
	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	/**
	 * This method will return the required shape from cached HashTable data of
	 * shape
	 * 
	 * @param id
	 *            id for which shape is required
	 * @return the shape object
	 */
	public static Shape getShape(final String id) {
		Shape shape = shapeMap.get(id);
		try {
			shape= (Shape) shape.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return shape;
	}

	/**
	 * This method will load the shape data in to cache
	 */
	public static void loadCache() {
		Triangle triangle = new Triangle();
		triangle.setShapeId(ONE);
		shapeMap.put(triangle.getShapeId(), triangle);

		Square square = new Square();
		square.setShapeId(TWO);
		shapeMap.put(square.getShapeId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setShapeId(THREE);
		shapeMap.put(rectangle.getShapeId(), rectangle);
	}
}
