package main.java.model;

import java.util.Date;

/**
 * A model class for flight data
 * 
 *
 */
public class FlightData {

	private String flightNum;

	private String depLocation;

	private String arrLocation;

	private Date validity;

	private int fare;

	private String flightTime;

	private double flightDuration;

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getDepLocation() {
		return depLocation;
	}

	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}

	public String getArrLocation() {
		return arrLocation;
	}

	public void setArrLocation(String arrLocation) {
		this.arrLocation = arrLocation;
	}

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public double getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(double flightDuration) {
		this.flightDuration = flightDuration;
	}

	@Override
	public String toString() {
		return "FlightData [flightNum=" + flightNum + ", depLocation=" + depLocation + ", arrLocation=" + arrLocation
				+ ", validity=" + validity + ", fare=" + fare + ", flightTime=" + flightTime + ", flightDuration="
				+ flightDuration + "]";
	}

}
