package main.java.filereader;

import java.util.List;

import main.java.model.FlightData;

/**
 * A file reader intrerface for application
 * 
 * @author rdixi7
 *
 */
public interface FileReader {
	/**
	 * This method read flight data file and return the Flight data model object
	 * 
	 * @return
	 */
	List<FlightData> readFlighDataFile(final String filePath);

}
