package src.main.java.structural.facade;

/**
 * 
 * Triangle subclass of shape class
 * 
 */
public class Rectangle extends Shape {

	public Rectangle() {
		super();
		shapeType = FacadeConstants.RECTANGLE;
	}

	@Override
	protected void draw() {
		System.out.println(FacadeConstants.RECTANGLE_DRAW_DESCRIPTION);

	}

}
