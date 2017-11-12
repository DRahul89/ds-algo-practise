package main.java.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import main.java.constants.FlightDataConstants;
import main.java.model.FlightData;

/**
 * This class will read the CSV flight data files
 * 
 * @author rdixi7
 *
 */
public class CSVFileReader implements FileReader {

	@SuppressWarnings("deprecation")
	@Override
	public List<FlightData> readFlighDataFile(final String filePath) {
		int count = 0;
		String csvSeperator = FlightDataConstants.CSV_FILE_SEPERATOR;
		List<FlightData> flightData = new ArrayList<>();
		SimpleDateFormat smf = new SimpleDateFormat("dd-mm-yy");
		String fileLine = null;
		try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
			while ((fileLine = br.readLine()) != null) {
				try {
					if (++count == 1)
						continue;
					String[] data = fileLine.split(csvSeperator);
					FlightData fiData = new FlightData();
					fiData.setFlightNum(data[0]);
					fiData.setDepLocation(data[1]);
					fiData.setArrLocation(data[2]);
					fiData.setValidity(smf.parse(data[3]));
					fiData.setFlightTime(data[4]);
					fiData.setFlightDuration(Double.parseDouble(data[5]));
					fiData.setFare(Integer.parseInt(data[6]));
					flightData.add(fiData);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flightData;
	}

}
