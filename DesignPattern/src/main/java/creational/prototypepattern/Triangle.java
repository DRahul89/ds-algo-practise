package src.main.java.creational.prototypepattern;

/**
 * 
 * Triangle subclass of shape class
 * 
 */
public class Triangle extends Shape {

	public Triangle() {
		super();
		shapeType = ProtoTypeConstant.TRIANGLE;
	}

	@Override
	protected void draw() {
		System.out.println(ProtoTypeConstant.TRIANGLE_DRAW_DESCRIPTION);

	}

}
