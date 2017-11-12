package main.java.searchdetails;

import java.util.ArrayList;
import java.util.List;

import main.java.constants.FlightDataConstants;
import main.java.filereader.FileReader;
import main.java.filereader.FlightReaderFactory;
import main.java.model.FlightData;

/**
 * A utility to search a flight data from files
 * 
 * @author rdixi7
 *
 */
public class FlightSearchUtility {

	public static List<String> getFlightDataFileNames() {
		List<String> files = new ArrayList<>();
		files.add("a");
		files.add("b");
		files.add("c");
		return files;
	}

	/**
	 * This method will search the flight details with parameters
	 * 
	 * @param flightNum
	 * @param arrLoc
	 * @param depLoc
	 * @return
	 */
	public List<FlightData> searchFlightData(final String flightNum, final String arrLoc, final String depLoc) {
		List<FlightData> foundFlights = new ArrayList<>();
		List<String> flightDataFiles = getFlightDataFileNames();
		FileReader fileReader = FlightReaderFactory.getFileReader(FlightDataConstants.CSV_TYPE);
		for (String file : flightDataFiles) {
			List<FlightData> flightDatas = fileReader.readFlighDataFile(getFilePath(file));
			for (FlightData flightData : flightDatas) {
				if (flightData.getFlightNum().trim().equals(flightNum) || flightData.getArrLocation().equals(arrLoc)
						|| flightData.getDepLocation().equals(depLoc)) {
					foundFlights.add(flightData);
				}
			}

		}
		return foundFlights;

	}

	/**
	 * returns the file path
	 * 
	 * @param file
	 * @return
	 */
	private String getFilePath(String file) {
		return FlightDataConstants.FLIGHT_DATA_FILE_PATH + "//" + file + ".csv";
	}

}
