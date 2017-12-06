package metallica.refdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import metallica.refdata.model.CounterParty;
import metallica.refdata.service.CounterPartyService;



/**
 * 
 * A controller for Counter party data
 *
 */
@RestController
public class CounterPartyController extends BaseController {

	@Autowired
	private CounterPartyService counterPartyService;

	@RequestMapping(value = "/counterParty", method = RequestMethod.GET)
	public ResponseEntity<List<CounterParty>> getCounterPartyList() {
		return new ResponseEntity<List<CounterParty>>(counterPartyService.getAllCounterParties(), HttpStatus.OK);
	}
}
