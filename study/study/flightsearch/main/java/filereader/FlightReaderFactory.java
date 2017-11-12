package main.java.filereader;

import main.java.constants.FlightDataConstants;

/**
 * This class would return a object of file containing flight data
 * 
 * @author rdixi7
 *
 */
public class FlightReaderFactory {
	/**
	 * This method will return the object of required file reader
	 * 
	 * @param fileReaderType
	 *            type of file reader like csv,excel
	 * @return
	 */
	public static FileReader getFileReader(final String fileReaderType) {
		FileReader fileReader = null;
		if (fileReaderType.equals(FlightDataConstants.CSV_TYPE)) {
			fileReader = new CSVFileReader();
		}
		return fileReader;
	}
}
