package main.java.com.nitro.cab.model;

/**
 * A model object for cab booking requests
 *
 */
public class CabBookingRequest {

	private String bookingId;

	private int pickUpArea;

	private int dropArea;

	private int pickUpTime;

	private String timeFormat;

	public CabBookingRequest(String bookingId, int pickUpArea, int dropArea, int pickUpTime, String timeFormat) {
		this.bookingId = bookingId;
		this.pickUpArea = pickUpArea;
		this.dropArea = dropArea;
		this.pickUpTime = pickUpTime;
		this.timeFormat = timeFormat;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public int getPickUpArea() {
		return pickUpArea;
	}

	public void setPickUpArea(int pickUpArea) {
		this.pickUpArea = pickUpArea;
	}

	public int getDropArea() {
		return dropArea;
	}

	public void setDropArea(int dropArea) {
		this.dropArea = dropArea;
	}

	public int getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(int pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getTimeFormat() {
		return timeFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

}
