package src.main.java.behavioral.observer.Custom;

/**
 * 
 * A station which will update the weather info.
 * 
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final WeatherData weatherData = new WeatherData();
		final CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(
				weatherData);
		weatherData.setMeasurement(1, 2.4f, 3.8f);
		weatherData.removeObserver(currentWeatherDisplay);
		weatherData.setMeasurement(1.2f, 2.3f, 3.5f);
		weatherData.setMeasurement(1.2f, 2.1f, 3.4f);

	}

}
