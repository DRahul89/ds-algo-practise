package main.java.test;

import java.util.Collections;
import java.util.List;

import main.java.model.FlightData;
import main.java.searchdetails.FlightComparator;
import main.java.searchdetails.FlightSearchUtility;

public class FlightSearchTest {

	public static void main(String[] args) {
		FlightSearchUtility flightSearchUtility = new FlightSearchUtility();
		List<FlightData> flightData = flightSearchUtility.searchFlightData("LH348","AMS","MUC");
		Collections.sort(flightData,new FlightComparator());
		if (null != flightData) {
			for (FlightData flightData2 : flightData) {
				System.out.println(flightData2);
			}
		} else {
			System.out.println("Nothing found");
		}
	}

}
