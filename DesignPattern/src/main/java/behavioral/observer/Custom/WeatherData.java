package src.main.java.behavioral.observer.Custom;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * It is a concrete implementation for subject.
 * 
 */
public class WeatherData implements Subject {
	/**
	 * contains List of registered Observers on this subject
	 */
	private List<Observer> observers;
	/**
	 * Contains the data for tempreture
	 */
	private float temp;
	/**
	 * Contains the data for humidity
	 */
	private float humidity;
	/**
	 * Contains the data for pressure
	 */
	private float pressure;

	public WeatherData() {

		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer register) {
		observers.add(register);

	}

	@Override
	public void removeObserver(Observer remove) {
		int index = observers.indexOf(remove);
		if (index >= 0) {
			observers.remove(remove);
		}

	}

	/**
	 * This method will be called in case of change in measurement data
	 */
	public void measurementChanged() {
		notifyObservers();
	}

	/**
	 * This method will set the new measurement data
	 * 
	 * @param temp
	 *            tempreture of new measurement
	 * @param humidity
	 *            humidity of new measurement
	 * @param pressure
	 *            pressure of new measurement
	 */
	public void setMeasurement(final float temp, final float humidity,
			final float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.temp, this.humidity, this.pressure);
		}

	}
}
