package metallica.refdata.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metallica.refdata.common.RefDataException;
import metallica.refdata.dao.CommodityDao;
import metallica.refdata.model.Commodity;
import metallica.refdata.service.CommodityService;


/**
 * 
 * Implementation of {@link CommodityService}
 *
 */
@Service
public class CommodityServiceImpl implements CommodityService {
	
	Logger log = LoggerFactory.getLogger(CommodityService.class);
	@Autowired
	private CommodityDao commodityDao;

	@Override
	public List<Commodity> getAllCommodities() {
		List<Commodity> commodities = null;
		try {
			commodities = commodityDao.getAllCommodities();
			log.debug("fetched commodities {}", commodities);
		} catch (Exception e) {
			log.error("There is some exception in fetching commodities {}", e.getMessage());
			throw new RefDataException(e);
		}
		// TODO Auto-generated method stub
		return commodities;
	}

}
