package metallica.refdata.dao;

import java.util.List;

import metallica.refdata.model.Location;



/**
 * 
 * specification for Location operations
 *
 */
public interface LocationDao {

	/**
	 * get all locations
	 * 
	 * @return
	 */
	List<Location> getAllLocations();
}
