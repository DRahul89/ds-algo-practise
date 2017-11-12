package src.main.java.creational.prototypepattern;

/**
 * 
 * Rectangle subclass of shape class
 * 
 */
public class Rectangle extends Shape {

	public Rectangle() {
		super();
		shapeType = ProtoTypeConstant.RECTANGLE;
	}

	@Override
	protected void draw() {
		System.out.println(ProtoTypeConstant.RECTANGLE_DRAW_DESCRIPTION);

	}

}
