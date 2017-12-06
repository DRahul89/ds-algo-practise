package metallica.trade.dao.impl;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import metallica.trade.dao.TradeDao;
import metallica.trade.enums.Side;
import metallica.trade.enums.TradeStatus;
import metallica.trade.model.TradeData;

/**
 * an implementation for {@link TradeDao}
 * 
 *
 */
@Repository
public class TradeDaoImpl implements TradeDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public List<TradeData> getAllTrades(final BigInteger userId) {
		List<TradeData> trades = new ArrayList<>();
		return JdbcTemplate.query("select * from  trade_data.trade where user_id = ?",
				new Object[] { userId.intValue() }, (rs) -> {

					while (rs.next()) {
						TradeData tradeData = new TradeData();
						tradeData.setTradeId(BigInteger.valueOf(rs.getLong(1)));
						tradeData.setSide(Side.valueOf(rs.getString(2)));
						tradeData.setQuantity(rs.getInt(3));
						tradeData.setPrice(rs.getDouble(4));
						tradeData.setTradeDate(rs.getDate(5).toLocalDate().toString());
						tradeData.setTradeStatus(TradeStatus.valueOf(rs.getString(6)));
						tradeData.setCounterPartId(BigInteger.valueOf(rs.getLong(7)));
						tradeData.setCommodityId(rs.getString(8));
						tradeData.setLocationId(rs.getString(9));
						tradeData.setUserId(userId);
						trades.add(tradeData);
					}
					return trades;
				});
	}

	@Override
	public TradeData getTradeById(BigInteger userId, BigInteger tradeId) {
		return JdbcTemplate.query("select * from  trade_data.trade where user_id = ? and trade_id = ?",
				new Object[] { userId.intValue(), tradeId.intValue() }, (rs) -> {
					TradeData tradeData = new TradeData();
					while (rs.next()) {
						tradeData.setTradeId(BigInteger.valueOf(rs.getLong(1)));
						tradeData.setSide(Side.valueOf(rs.getString(2)));
						tradeData.setQuantity(rs.getInt(3));
						tradeData.setPrice(rs.getDouble(4));
						tradeData.setTradeDate(rs.getDate(5).toLocalDate().toString());
						tradeData.setTradeStatus(TradeStatus.valueOf(rs.getString(6)));
						tradeData.setCounterPartId(BigInteger.valueOf(rs.getLong(7)));
						tradeData.setCommodityId(rs.getString(8));
						tradeData.setLocationId(rs.getString(9));
						tradeData.setUserId(userId);

					}
					return tradeData;
				});
	}

	@Override
	public void saveTrade(BigInteger userId, TradeData trade) {
		JdbcTemplate.update("insert into trade_data.trade values (?,?,?,?,?,?,?,?,?,?)", ps -> {
			ps.setLong(1, trade.getTradeId().longValue());
			ps.setString(2, trade.getSide().name());
			ps.setInt(3, trade.getQuantity().intValue());
			ps.setDouble(4, trade.getPrice());
			ps.setDate(5, Date.valueOf(trade.getTradeDate()));
			ps.setString(6, trade.getTradeStatus().name());
			ps.setLong(7, trade.getCounterPartId().longValue());
			ps.setString(8, trade.getCommodityId());
			ps.setString(9, trade.getLocationId());
			ps.setLong(10, userId.longValue());

		});

	}

	@Override
	public void deleteTrade(BigInteger userId, BigInteger tradeId) {
		JdbcTemplate.update("delete from trade_data.trade where user_id = ? and trade_id = ?",
				new Object[] { userId.intValue(), tradeId.intValue() });
	}

}
