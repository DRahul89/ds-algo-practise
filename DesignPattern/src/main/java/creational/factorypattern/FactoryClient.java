package src.main.java.creational.factorypattern;

/**
 * 
 * A demo class for Factory Design pattern
 * 
 */
public class FactoryClient {

	private static final String TRIANGLE_PRINT_DESC = ":::::::TRIANGLE::::::::";

	private static final String RECTANGLE_PRINT_DESC = ":::::::RECTIANGLE::::::::";

	private static final String TRIANGLE_AREA_DESC = "Area for Triangle is :";

	private static final String RECTANGLE_AREA_DESC = "Area for Rectangle is :";

	public static void testFactory() {
		System.out.println(TRIANGLE_PRINT_DESC);
		final Shape triangle = ShapeFactory.getShape(ShapeFactory.TRIANGLE, 2l, 8l);
		System.out.println(new StringBuilder(TRIANGLE_AREA_DESC
				+ triangle.calculateArea()));
		System.out.println(RECTANGLE_PRINT_DESC);
		final Shape rectangle = ShapeFactory.getShape(ShapeFactory.RECTANGLE, 6l, 8l);
		System.out.println(new StringBuilder(RECTANGLE_AREA_DESC
				+ rectangle.calculateArea()));
	}

	public static void main(String[] args) {
		testFactory();
	}
}
