package src.main.java.structural.facade;

/**
 * 
 * Square subclass of shape class
 * 
 */
public class Square extends Shape {

	public Square() {
		super();
		shapeType = FacadeConstants.SQUARE;
	}

	@Override
	protected void draw() {
		System.out.println(FacadeConstants.SQUARE_DRAW_DESCRIPTION);

	}
}
