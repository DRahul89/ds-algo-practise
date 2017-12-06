package metallica.refdata.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import metallica.refdata.dao.LocationDao;
import metallica.refdata.model.Location;



/**
 * 
 * An implementation for {@link CommodityDao}
 *
 */
@Repository
public class LocationDaoImpl implements LocationDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = new ArrayList<>();
		return JdbcTemplate.query("select * from refdata.location", (rs) -> {
			while (rs.next()) {
				Location location = new Location(rs.getString(1), rs.getString(2));
				locations.add(location);
			}
			return locations;
		});
	}

}
