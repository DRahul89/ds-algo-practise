package metallica.trade.model;

import java.math.BigInteger;
import java.time.LocalDate;

import metallica.trade.enums.Side;
import metallica.trade.enums.TradeStatus;

public class TradeData {

	private BigInteger tradeId;

	private Integer quantity;

	private Double price;

	private Side side;

	private String tradeDate;

	private TradeStatus tradeStatus;

	private BigInteger counterPartId;

	private String commodityId;

	private String locationId;

	private BigInteger userId;

	public BigInteger getTradeId() {
		return tradeId;
	}

	public void setTradeId(BigInteger tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public TradeStatus getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(TradeStatus tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public BigInteger getCounterPartId() {
		return counterPartId;
	}

	public void setCounterPartId(BigInteger counterPartId) {
		this.counterPartId = counterPartId;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

}
