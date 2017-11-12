package src.main.java.behavioral.observer.Custom;

/**
 * 
 * A common interface for all observers
 * 
 */
public interface Observer {
	/**
	 * This method will be called on observing any change to subject
	 * 
	 * @param temp tempreture of weather
	 * @param humidity humidity of weather
	 * @param pressure pressure of weather
	 */
	void update(final float temp, final float humidity, final float pressure);
}
