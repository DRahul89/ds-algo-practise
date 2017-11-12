package src.main.java.creational.singeltonpattern;

import java.io.Serializable;

/**
 * 
 * Singleton Class for singleton pattern
 * 
 */
public class SingleObject implements Serializable {

	private static final String HELLO_WORLD = "Hello World!";

	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 6883512659907027777L;

	/**
	 * Contain the single static instance of same class
	 */
	private static SingleObject instance = new SingleObject();

	private SingleObject() {
	}

	/**
	 * This method will return the instance of singleston object
	 * 
	 * @return instance of SingleObject
	 */
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println(HELLO_WORLD);
	}

}
