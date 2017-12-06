package metallica.refdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import metallica.refdata.model.Location;
import metallica.refdata.service.LocationService;



/**
 * 
 * controller for location
 *
 */
@RestController
public class LocationController extends BaseController {

	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value = "/location", method = RequestMethod.GET)
	public ResponseEntity<List<Location>> getLocationList() {
		return new ResponseEntity<List<Location>>(locationService.getAllLocations(), HttpStatus.OK);
	}
}
