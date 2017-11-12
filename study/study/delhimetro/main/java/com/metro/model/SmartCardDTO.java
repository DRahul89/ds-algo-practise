package main.java.com.metro.model;

public class SmartCardDTO {

	private String journeyId;

	private String cardId;

	private String fromstation;

	private String tostation;

	private double totalBalance;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getFromstation() {
		return fromstation;
	}

	public void setFromstation(String fromstation) {
		this.fromstation = fromstation;
	}

	public String getTostation() {
		return tostation;
	}

	public void setTostation(String tostation) {
		this.tostation = tostation;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	public SmartCard convertFromDtoToDao() {
		SmartCard smartCard = new SmartCard();
		smartCard.setCardId(this.cardId);
		smartCard.setFromstation(this.fromstation);
		smartCard.setTostation(this.tostation);
		smartCard.setTotalBalance(this.totalBalance);
		smartCard.setJourneyId(this.journeyId);
		return smartCard;
	}

	@Override
	public String toString() {
		return "SmartCardDTO [journeyId=" + journeyId + ", cardId=" + cardId + ", fromstation=" + fromstation
				+ ", tostation=" + tostation + ", totalBalance=" + totalBalance + "]";
	}

	
}
