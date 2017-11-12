package main.java.com.nitro.cab.model;

/**
 * A model class for nitro cabs
 *
 */
public class NitroCab {

	private String cabNo;

	private int initialLocation;

	private String bookingId;

	private double profitPercentage;

	public NitroCab(final String cabNo, final int initialLocation) {
		this.cabNo = cabNo;
		this.initialLocation = initialLocation;
	}

	public String getCabNo() {
		return cabNo;
	}

	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}

	public int getInitialLocation() {
		return initialLocation;
	}

	public void setInitialLocation(int initialLocation) {
		this.initialLocation = initialLocation;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public double getProfitPercentage() {
		return profitPercentage;
	}

	public void setProfitPercentage(double profitPercentage) {
		this.profitPercentage = profitPercentage;
	}

	@Override
	public String toString() {
		return "NitroCab [cabNo=" + cabNo + ", initialLocation=" + initialLocation + ", bookingId=" + bookingId
				+ ", profitPercentage=" + profitPercentage + "]";
	}

}
