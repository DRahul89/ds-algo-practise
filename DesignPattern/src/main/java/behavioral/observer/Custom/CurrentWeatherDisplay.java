package src.main.java.behavioral.observer.Custom;

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
	 * Contains the refernce of subject in our case it is weather Data object
	 */
	private Subject weatherData;

	public CurrentWeatherDisplay(final Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(final float temp, final float humidity, final float pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		diplay();
	}

	/**
	 * This method will diplay the updated measurement weather data
	 */
	private void diplay() {
		System.out.println(new StringBuilder(HUMIDITY_CONSTANT + humidity + TEMPRETURE_CONSTANT + temp
				+ PRESSURE_CONSTANT + pressure));

	}

}
