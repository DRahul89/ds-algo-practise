package src.main.java.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * it is an observer which is observing the weatherdata to be changed.
 * 
 */
public class CurrentWeatherDisplay implements Observer {

	/**
	 * Constant for humidity description
	 */
	private static final String HUMIDITY_CONSTANT = "current conditions humidity=";
	/**
	 * Constant for tempreture description
	 */
	private static final String TEMPRETURE_CONSTANT = "current conditions humidity=";
	/**
	 * Constant for pressure description
	 */
	private static final String PRESSURE_CONSTANT = "current conditions humidity=";

	/**
	 * contains the humidity value
	 */
	private float humidity;
	/**
	 * contains the pressure value
	 */
	private float pressure;
	/**
	 * contains the tempreture value
	 */
	private float temp;
	/**
	 * contains the Observable instance
	 */
	Observable weatherData;

	public CurrentWeatherDisplay(final Observable weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}

	/**
	 * This method will diplay the updated measurement weather data
	 */
	private void diplay() {
		System.out.println(new StringBuilder(HUMIDITY_CONSTANT + humidity
				+ TEMPRETURE_CONSTANT + temp + PRESSURE_CONSTANT + pressure));

	}

	
	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) arg;
			this.humidity = weatherData.getHumidity();
			this.temp = weatherData.getTemp();
			this.pressure = weatherData.getPressure();
			diplay();
		}

	}

}
