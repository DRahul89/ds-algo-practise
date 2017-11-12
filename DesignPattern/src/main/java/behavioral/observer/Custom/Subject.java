package src.main.java.behavioral.observer.Custom;

/**
 * 
 * A subject to which all observers observe for any change.So it is like
 * observable
 * 
 */
public interface Subject {
	/**
	 * This method is used for registration of a observer for this subject
	 * 
	 * @param register
	 *            Observer object
	 */
	void registerObserver(Observer register);

	/**
	 * This method is used for removing the registration of a observer for this
	 * subject
	 * 
	 * @param remove
	 *            Observer Object
	 */
	void removeObserver(Observer remove);

	/**
	 * This method will notify all the observers in case of any uodation in
	 * subject
	 */
	void notifyObservers();
}
