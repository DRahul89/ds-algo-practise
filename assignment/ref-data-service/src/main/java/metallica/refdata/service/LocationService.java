package metallica.refdata.service;

import java.util.List;

import metallica.refdata.model.Location;


/**
 * 
 * specification for all locations
 *
 */
public interface LocationService {

	/**
	 * get all locations
	 * 
	 * @return
	 */
	List<Location> getAllLocations();
}
