package main.java.com.nitro.cab.business;

import java.util.List;
import java.util.Map;

import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;

/**
 * 
 * A facade for assigning the available cabs to cab requests
 */
public interface CabBookingFacade {
	/**
	 * This method returns the suitable cab for a particular cab request
	 * according to the nitro cab rules
	 * 
	 * @param availableCab
	 * @param bookingRequests
	 * @return
	 */
	public Map<String, NitroCab> getSuitableCab(final List<NitroCab> availableCab,
			final List<CabBookingRequest> bookingRequests);

}
