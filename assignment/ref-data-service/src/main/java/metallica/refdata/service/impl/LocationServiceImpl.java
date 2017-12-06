package metallica.refdata.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metallica.refdata.common.RefDataException;
import metallica.refdata.dao.LocationDao;
import metallica.refdata.model.Location;
import metallica.refdata.service.LocationService;



@Service
public class LocationServiceImpl implements LocationService {
	Logger log = LoggerFactory.getLogger(LocationService.class);
	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = null;
		try {
			locations = locationDao.getAllLocations();
			log.debug("fetched locations {}", locations);
		} catch (Exception e) {
			log.error("There is some exception in fetching locations {}", e.getMessage());
			throw new RefDataException(e);
		}
		// TODO Auto-generated method stub
		return locations;
	}
}
