package main.java.com.nitro.cab.service;

/**
 * Interface define all the methods required for Cab service
 * 
 *
 */
public interface CabService {
	/**
	 * this method will return the distance between source and destination in kM
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	public int calculateDistance(final int source, final int destination);

	/**
	 * this method will return the time required to travel between source and
	 * destination in minutes
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	public int calculateTime(final int source, final int destination);

	/**
	 * this method will return the time required to travel between source and
	 * destination in minutes
	 * 
	 * @param distance
	 * @return
	 */
	public double calculateProfitPercentage(int initialToPicUp,int pickUpToDrop);

}
