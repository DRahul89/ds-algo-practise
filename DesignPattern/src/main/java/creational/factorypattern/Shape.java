package src.main.java.creational.factorypattern;

/**
 * 
 * This is a abstract class for different kind of shapes and also define an
 * abstract method calculateArea
 * 
 */
public abstract class Shape {
	/**
	 * Contains the height of shape
	 */
	private Long height;
	/**
	 * contains the width of shape
	 */
	private Long width;

	public Shape(final Long height, final Long width) {
		this.height = height;
		this.width = width;
	}

	/**
	 * This method will calculate the Area of the Shape
	 * 
	 * @return the Area of type shape
	 */
	protected abstract double calculateArea();

	/**
	 * @return the height
	 */
	protected Long getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	protected void setHeight(final Long height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	protected Long getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	protected void setWidth(final Long width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Shape [height=" + height + ", width=" + width + "]";
	}

}
