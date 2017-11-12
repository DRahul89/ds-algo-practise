package main.java.com.metro.dao;

import java.util.List;

import main.java.com.metro.model.SmartCard;

/**
 * A Dao layer for smart card system
 *
 */
public interface SmartCardDAO {

	/**
	 * this method would save the smart card info to data source
	 * 
	 * @param smartCard
	 */
	public void saveCard(final SmartCard smartCard);

	/**
	 * this method would fetch the smart card info from data source
	 * 
	 * @param smartCard
	 */
	public List<SmartCard> getCardInfo(final String smartCardId);

	/**
	 * this method would fetch the smart card info from data source
	 * 
	 * @param smartCard
	 */
	public List<SmartCard> getAll();

}
