package main.java.com.metro.model;

import java.io.Serializable;

/**
 * a model class for smart card
 *
 */
public class SmartCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3483310719015727727L;

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

	public SmartCardDTO convertFromDaoToDTO() {
		SmartCardDTO smartCardDTO = new SmartCardDTO();
		smartCardDTO.setCardId(this.cardId);
		smartCardDTO.setFromstation(this.fromstation);
		smartCardDTO.setTostation(this.tostation);
		smartCardDTO.setTotalBalance(this.totalBalance);
		smartCardDTO.setJourneyId(this.journeyId);
		return smartCardDTO;
	}

}
