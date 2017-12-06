package metallica.trade.dao;

import java.math.BigInteger;
import java.util.List;

import metallica.trade.model.TradeData;

/**
 * 
 * interface to define trade operations
 *
 */
public interface TradeDao {
	/**
	 * Get all trades of a user
	 * 
	 * @param userId
	 * @return
	 */
	List<TradeData> getAllTrades(final BigInteger userId);

	/**
	 * get trade by id
	 * 
	 * @param userId
	 * @param tradeId
	 * @return
	 */
	TradeData getTradeById(final BigInteger userId, final BigInteger tradeId);

	/**
	 * save the trade data to system
	 * 
	 * @param trade
	 */
	void saveTrade(final BigInteger userId, final TradeData trade);


	/**
	 * delete trade data
	 * 
	 * @param userId
	 * @param tradeId
	 */
	void deleteTrade(final BigInteger userId, final BigInteger tradeId);

}
