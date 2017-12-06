package metallica.refdata.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metallica.refdata.common.RefDataException;
import metallica.refdata.dao.CounterPartyDao;
import metallica.refdata.model.CounterParty;
import metallica.refdata.service.CounterPartyService;



/**
 * 
 * implementation to {@link CounterPartyService}
 *
 */
@Service
public class CounterPartyServiceImpl implements CounterPartyService {

	Logger log = LoggerFactory.getLogger(CounterPartyService.class);
	@Autowired
	private CounterPartyDao counterPartyDao;

	@Override
	public List<CounterParty> getAllCounterParties() {
		List<CounterParty> counterParties = null;
		try {
			counterParties = counterPartyDao.getAllCounterParty();
			log.debug("fetched counter patrties {}", counterParties);
		} catch (Exception e) {
			log.error("There is some exception in fetching counter party data {}", e.getMessage());
			throw new RefDataException(e);
		}
		// TODO Auto-generated method stub
		return counterParties;
	}

}
