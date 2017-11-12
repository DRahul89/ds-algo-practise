package src.main.java.creational.factorypattern;

/**
 * 
 * Triangle subclass of shape class
 * 
 */
public class Triangle extends Shape {

	private static final float HALF_VALUE = 0.5f;

	public Triangle(final Long height,final Long width) {
		super(height, width);
	}

	@Override
	protected double calculateArea() {

		return HALF_VALUE * getHeight() * getWidth();
	}

}
