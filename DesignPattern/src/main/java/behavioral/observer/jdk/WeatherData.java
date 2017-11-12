package src.main.java.behavioral.observer.jdk;

import java.util.Observable;

/**
 * 
 * It is a Observable class for all observers.
 * 
 */
public class WeatherData extends Observable {

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

	/**
	 * This method will be called in case of change in measurement data
	 */
	public void measurementChanged() {
		setChanged();
		notifyObservers(this);
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
	public void setMeasurement(final float temp, final float humidity, final float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	/**
	 * @return the temp
	 */
	protected float getTemp() {
		return temp;
	}

	/**
	 * @param temp
	 *            the temp to set
	 */
	protected void setTemp(final float temp) {
		this.temp = temp;
	}

	/**
	 * @return the humidity
	 */
	protected float getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	protected void setHumidity(final float humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the pressure
	 */
	protected float getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	protected void setPressure(final float pressure) {
		this.pressure = pressure;
	}

}
