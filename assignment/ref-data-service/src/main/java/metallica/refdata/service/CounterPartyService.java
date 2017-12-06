package metallica.refdata.service;

import java.util.List;

import metallica.refdata.model.CounterParty;



/**
 * 
 * Specification to all operations related to counter party
 *
 */
public interface CounterPartyService {
	/**
	 * get all counter parties
	 * 
	 * @return
	 */
	List<CounterParty> getAllCounterParties();

}
