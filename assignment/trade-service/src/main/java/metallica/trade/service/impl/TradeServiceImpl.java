package metallica.trade.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metallica.trade.common.TradeDataException;
import metallica.trade.dao.TradeDao;
import metallica.trade.enums.Command;
import metallica.trade.enums.Status;
import metallica.trade.mbean.TradeMessageSender;
import metallica.trade.model.TradeCommand;
import metallica.trade.model.TradeData;
import metallica.trade.service.TradeService;

/**
 * 
 * implementation of trade service {@link TradeService}
 *
 */
@Service
public class TradeServiceImpl implements TradeService {

	Logger log = LoggerFactory.getLogger(TradeService.class);

	@Autowired
	private TradeDao tradeDao;
	@Autowired
	private TradeMessageSender tradeMessageSender;

	@Override
	public void saveTrade(BigInteger userId, TradeData tradeData) {
		TradeCommand tradeCommand = new TradeCommand();
		try {
			tradeCommand.setCommandType(Command.TRADE_CREATED);
			tradeCommand.setStatus(Status.SUCCESS);
			tradeDao.saveTrade(userId, tradeData);
		} catch (Exception e) {
			tradeCommand.setStatus(Status.FAILURE);
			log.error("There is some exception {} in persisting trade data {}", e.getMessage(), tradeData);
			throw new TradeDataException(e);
		}finally{
			tradeMessageSender.sendTradeCommand(tradeCommand);
		}

	}

	@Override
	public void updateTrade(BigInteger userId, TradeData tradeData) {
		TradeCommand tradeCommand = new TradeCommand();
		try {
			tradeCommand.setCommandType(Command.TRADE_UPDATED);
			tradeCommand.setStatus(Status.SUCCESS);
			tradeDao.deleteTrade(userId, tradeData.getTradeId());
			tradeDao.saveTrade(userId, tradeData);
		} catch (Exception e) {
			tradeCommand.setStatus(Status.FAILURE);
			log.error("There is some exception {} in updating trade data {}", e.getMessage(), tradeData);
			throw new TradeDataException(e);
		}finally{
			tradeMessageSender.sendTradeCommand(tradeCommand);
		}

	}

	@Override
	public void deleteTrade(BigInteger userId, BigInteger tradeId) {
		TradeCommand tradeCommand = new TradeCommand();
		try {
			tradeCommand.setCommandType(Command.TRADE_DELETED);
			tradeCommand.setStatus(Status.SUCCESS);
			tradeDao.deleteTrade(userId, tradeId);
		} catch (Exception e) {
			tradeCommand.setStatus(Status.FAILURE);
			log.error("There is some exception {} in deleting trade data for trade id{} and user id", e.getMessage(),
					tradeId, userId);
			throw new TradeDataException(e);
		}finally{
			tradeMessageSender.sendTradeCommand(tradeCommand);
		}

	}

	@Override
	public List<TradeData> getAllTrades(BigInteger userId) {
		try {
			return tradeDao.getAllTrades(userId);
		} catch (Exception e) {
			log.error("There is some exception {} in fetching trade data for user id{}", e.getMessage(), userId);
			throw new TradeDataException(e);
		}
	}

	@Override
	public TradeData getTradeById(BigInteger userId, BigInteger tradeId) {
		try {
			return tradeDao.getTradeById(userId, tradeId);
		} catch (Exception e) {
			log.error("There is some exception {} in fetching trade data for user id{} and trade id ", e.getMessage(),
					userId, tradeId);
			throw new TradeDataException(e);
		}
	}

}
