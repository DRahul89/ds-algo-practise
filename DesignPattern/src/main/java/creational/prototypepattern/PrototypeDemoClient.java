package src.main.java.creational.prototypepattern;

/**
 * 
 * A class for demo of prototype patterns
 * 
 */
public class PrototypeDemoClient {

	private static final  String SHAPE = "Shape : ";

	public static void main(String[] args) {
		ShapeCache.loadCache();

		final Shape clonedShape = (Shape) ShapeCache.getShape(ShapeCache.ONE);
		System.out.println(new StringBuilder(SHAPE + clonedShape.getShapeType()));

		final Shape clonedShapeSecond = (Shape) ShapeCache.getShape(ShapeCache.TWO);
		System.out.println(new StringBuilder(SHAPE
				+ clonedShapeSecond.getShapeType()));

		final Shape clonedShapeThird = (Shape) ShapeCache.getShape(ShapeCache.THREE);
		System.out
				.println(new StringBuilder(SHAPE + clonedShapeThird.getShapeType()));
	}
}
