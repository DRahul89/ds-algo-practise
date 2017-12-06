package metallica.refdata.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import metallica.refdata.dao.CounterPartyDao;
import metallica.refdata.model.CounterParty;


/**
 * 
 * An implementation to {@link CounterPartyDao}
 *
 */
@Repository
public class CounterPartyDaoImpl implements CounterPartyDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public List<CounterParty> getAllCounterParty() {
		List<CounterParty> counterParties = new ArrayList<>();
		return JdbcTemplate.query("select * from refdata.counterparty", (rs) -> {
			while (rs.next()) {
				CounterParty counterParty = new CounterParty(rs.getLong(1), rs.getString(2));
				counterParties.add(counterParty);
			}
			return counterParties;
		});
	}

}
