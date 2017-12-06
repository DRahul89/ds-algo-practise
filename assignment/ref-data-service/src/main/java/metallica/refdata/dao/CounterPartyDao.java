package metallica.refdata.dao;

import java.util.List;

import metallica.refdata.model.CounterParty;


/**
 * 
 * A data access specification for Counter party objects
 *
 */
public interface CounterPartyDao {
	/**
	 * get all counter party data
	 * 
	 * @return
	 */
	List<CounterParty> getAllCounterParty();
}
