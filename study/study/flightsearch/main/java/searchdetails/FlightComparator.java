package main.java.searchdetails;

import java.util.Comparator;

import main.java.model.FlightData;

public class FlightComparator implements Comparator<FlightData> {

	@Override
	public int compare(FlightData o1, FlightData o2) {
		return o1.getValidity().compareTo(o2.getValidity());
	}

}
