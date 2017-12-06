package metallica.trade.service;

import java.math.BigInteger;
import java.util.List;

import metallica.trade.model.TradeData;

/**
 * a specification for trade data operations
 * 
 *
 */
public interface TradeService {
	/**
	 * save trade data to system
	 * 
	 * @param userId
	 * @param tradeData
	 */
	public void saveTrade(final BigInteger userId, final TradeData tradeData);

	/**
	 * update trade data to system
	 * 
	 * @param userId
	 * @param tradeData
	 */
	public void updateTrade(final BigInteger userId, final TradeData tradeData);

	/**
	 * delete trade data to system
	 * 
	 * @param userId
	 */
	public void deleteTrade(final BigInteger userId, final BigInteger tradeId);

	/**
	 * get all trade data
	 * 
	 * @param userId
	 * @return
	 */
	public List<TradeData> getAllTrades(final BigInteger userId);

	/**
	 * get trade data by id
	 * 
	 * @param userId
	 * @param tradeId
	 * @return
	 */
	public TradeData getTradeById(final BigInteger userId, final BigInteger tradeId);
}
