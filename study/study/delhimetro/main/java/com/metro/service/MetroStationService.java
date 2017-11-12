package main.java.com.metro.service;

/**
 * This interface define all the methods required for delhi metro station
 * 
 *
 */
public interface MetroStationService {
	/**
	 * This method would return the total no of swipe in for this station
	 * 
	 * @param stationId
	 * @return
	 */
	public int getSwipeInCount(final String stationId);

	/**
	 * This method would return the total no of swipe out for this station
	 * 
	 * @param stationId
	 * @return
	 */
	public int getSwipeOutCount(final String stationId);

}
