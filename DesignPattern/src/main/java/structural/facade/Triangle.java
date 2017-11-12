package src.main.java.structural.facade;

/**
 * 
 * Triangle subclass of shape class
 * 
 */
public class Triangle extends Shape {


	public Triangle() {
		super();
		shapeType = FacadeConstants.TRIANGLE;
	}

	@Override
	protected void draw() {
		System.out.println(FacadeConstants.TRIANGLE_DRAW_DESCRIPTION);

	}

}
