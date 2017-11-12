package src.main.java.creational.factorypattern;

/**
 * 
 * Rectangle subclass of shape class
 * 
 */
public class Rectangle extends Shape {

	public Rectangle(final Long height,final Long width) {
		super(height, width);

	}

	@Override
	protected double calculateArea() {
		return getHeight() * getWidth();
	}

}
