package metallica.refdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import metallica.refdata.model.Commodity;
import metallica.refdata.service.CommodityService;



/**
 * 
 * A controller for commodity data
 *
 */
@RestController
public class CommodityController extends BaseController {

	@Autowired
	private CommodityService commodityService;

	@RequestMapping(value = "/commodity", method = RequestMethod.GET)
	public ResponseEntity<List<Commodity>> getCommodityList() {
		return new ResponseEntity<List<Commodity>>(commodityService.getAllCommodities(), HttpStatus.OK);
	}
}
