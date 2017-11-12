package src.main.java.behavioral.Iterator;

/**
 * 
 * An interface which will contain the methods used for iteration over a
 * collection
 * 
 */
public interface Iterator {
	/**
	 * This method will check that is there any next element in the collection
	 * or return true and false accordingly
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * This method will return the next object in collection
	 * 
	 * @return Object is the next object in collection
	 */
	Object next();
}
