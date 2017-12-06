package metallica.refdata.service;

import java.util.List;

import metallica.refdata.model.Commodity;


/**
 * 
 * specification of commodity operations
 *
 */
public interface CommodityService {
	/**
	 * get all commodities
	 * 
	 * @return
	 */
	List<Commodity> getAllCommodities();

}
