package metallica.refdata.dao;

import java.util.List;

import metallica.refdata.model.Commodity;



/**
 * 
 * specification commodity operations 
 *
 */
public interface CommodityDao {
	
	
	/**
	 * get all commodities
	 * 
	 * @return
	 */
	List<Commodity> getAllCommodities();

}
