package src.main.java.structural.decorator;

/**
 * 
 * An abstract class which subclasses will be used for decorating the Icecream
 * Object at run time
 * 
 */
public abstract class IceCreamDecorator implements Icecream {
	/**
	 * Contains a reference of icecream
	 */
	public Icecream icecream;

	public IceCreamDecorator(final Icecream icecream) {
		this.icecream = icecream;
	}
}
