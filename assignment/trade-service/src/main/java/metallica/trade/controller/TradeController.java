package metallica.trade.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import metallica.trade.model.TradeData;
import metallica.trade.service.TradeService;

/**
 * A controller for trade operations
 * 
 *
 */
@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;

	@RequestMapping(value = "/trade/{userId}", method = RequestMethod.GET)
	public ResponseEntity<List<TradeData>> getAllTradeList(@PathVariable String userId) {
		return new ResponseEntity<List<TradeData>>(tradeService.getAllTrades(new BigInteger(userId)), HttpStatus.OK);
	}

	@RequestMapping(value = "/trade/{userId}/{tradeId}", method = RequestMethod.GET)
	public ResponseEntity<TradeData> getAllTradeList(@PathVariable String userId, @PathVariable String tradeId) {
		return new ResponseEntity<TradeData>(tradeService.getTradeById(new BigInteger(userId), new BigInteger(tradeId)),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/trade/update/{userId}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateTrade(@PathVariable String userId, @RequestBody TradeData tradeData) {
		tradeService.updateTrade(new BigInteger(userId), tradeData);
		return new ResponseEntity<String>("Trade updated succesfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/trade/save/{userId}", method = RequestMethod.POST)
	public ResponseEntity<String> saveTrade(@PathVariable String userId, @RequestBody TradeData tradeData) {
		tradeService.saveTrade(new BigInteger(userId), tradeData);
		return new ResponseEntity<String>("Trade persisted succesfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/trade/delete/{userId}/{tradeId}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteTrade(@PathVariable String userId,@PathVariable String tradeId) {
		tradeService.deleteTrade(new BigInteger(userId), new BigInteger(tradeId));
		return new ResponseEntity<String>("Trade deleted succesfully", HttpStatus.OK);
	}

}
