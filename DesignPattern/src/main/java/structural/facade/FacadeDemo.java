package src.main.java.structural.facade;

/**
 * 
 * A demo class for facade design pattern
 * 
 */
public class FacadeDemo {

	public static void main(String[] args) {
		ShapeMakerFacade shapeObject = new ShapeMakerFacade(
				FacadeConstants.TRIANGLE);
		shapeObject.drawShape();
		shapeObject = new ShapeMakerFacade(FacadeConstants.RECTANGLE);
		shapeObject.drawShape();
		shapeObject = new ShapeMakerFacade(FacadeConstants.SQUARE);
		shapeObject.drawShape();

	}

}
