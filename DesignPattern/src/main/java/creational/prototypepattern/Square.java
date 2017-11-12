package src.main.java.creational.prototypepattern;

public class Square extends Shape {

	public Square() {
		super();
		shapeType = ProtoTypeConstant.SQUARE;
	}

	@Override
	protected void draw() {
		System.out.println(ProtoTypeConstant.SQUARE_DRAW_DESCRIPTION);

	}
}
