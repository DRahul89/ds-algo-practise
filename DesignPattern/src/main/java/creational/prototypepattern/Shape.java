package src.main.java.creational.prototypepattern;

/**
 * 
 * A general shape class which will contain a abstarct draw methods for all kind
 * of shapes
 * 
 */
public abstract class Shape implements Cloneable {
	/**
	 * instance field for id of shape
	 */
	private String shapeId;
	/**
	 * instance field for type of shape
	 */
	protected String shapeType;

	/**
	 * This method will draw the shape
	 */
	protected abstract void draw();


	/**
	 * @return the shapeId
	 */
	protected String getShapeId() {
		return shapeId;
	}


	/**
	 * @param shapeId the shapeId to set
	 */
	protected void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}



	/**
	 * @return the shapeType
	 */
	protected String getShapeType() {
		return shapeType;
	}


	/**
	 * @param shapeType the shapeType to set
	 */
	protected void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}


	/**
	 * Clone method for returning the clone object for this class object
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	@Override
	public String toString() {
		return "Shape [shapeId=" + shapeId + ", shapeType=" + shapeType + "]";
	}

}
