package src.main.java.creational.singeltonpattern;

/**
 * A demo class for singleton object
 * 
 * 
 */
public class SingleObjectDemo {

	private static final String SINGELTON_MESSAGE = "Same hash id for both instance so singleton";

	public static void main(String[] args) throws CloneNotSupportedException {

		final SingleObject object = SingleObject.getInstance();

		System.out.println(object);

		final SingleObject secondInstance = SingleObject.getInstance();

		System.out.println(secondInstance);

		System.out.println(SINGELTON_MESSAGE);

	}
}
