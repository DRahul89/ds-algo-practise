package metallica.refdata.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import metallica.refdata.dao.CommodityDao;
import metallica.refdata.model.Commodity;


/**
 * 
 *An implementation for {@link CommodityDao}
 *
 */
@Repository
public class CommodityDaoImpl implements CommodityDao {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	@Override
	public List<Commodity> getAllCommodities() {
		List<Commodity> commodities = new ArrayList<>();
		return JdbcTemplate.query("select * from refdata.commodity", (rs) -> {
			while (rs.next()) {
				Commodity counterParty = new Commodity(rs.getString(1), rs.getString(2));
				commodities.add(counterParty);
			}
			return commodities;
		});
	}

}
