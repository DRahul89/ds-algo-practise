package main.java.com.metro.dao;

import main.java.com.metro.model.SmartCard;

public interface MetroStationDAO {
	/**
	 * this method would save the station info to data source
	 * 
	 * @param smartCard
	 */
	public void saveStationInfo(final SmartCard smartCard);

	/**
	 * this method would fetch the station info from data source
	 * 
	 * @param smartCard
	 */
	public void getStationInfo(final String smartCardId);

	/**
	 * this method would fetch all the station info from data source
	 * 
	 * @param smartCard
	 */
	public void getAllStationInfo(final String smartCardId);
}
