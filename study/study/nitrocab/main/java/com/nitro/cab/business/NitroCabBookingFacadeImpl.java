package main.java.com.nitro.cab.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.nitro.cab.constants.NitroCabConstants;
import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;
import main.java.com.nitro.cab.service.CabService;
import main.java.com.nitro.cab.serviceimpl.NitroCabServiceImpl;

/**
 * This class would do the actual work and assign the available nitro cabs to
 * cab booking requests
 *
 */
public class NitroCabBookingFacadeImpl implements CabBookingFacade {

	private CabCommand cabCommand;

	private CabService cabService;

	private int hour = 4;

	/**
	 * this method would calculate the cab is reachable to pickup up time
	 * according to nitro cab policy or not
	 * 
	 * @param nitroCab
	 * @param cabBookingRequest
	 * @return
	 */
	private boolean isReachableToPickUpOnTime(final NitroCab nitroCab, final CabBookingRequest cabBookingRequest) {
		Boolean isReachable = Boolean.FALSE;
		cabService = new NitroCabServiceImpl();
		cabCommand = new CalculateTimeRequiredCommand(cabService);
		double cabBookingTime = 0;
		double totalCabReachTime = 0;
		double timeRequiredInMinutes = cabCommand.calculateTime(nitroCab, cabBookingRequest);
		if (cabBookingRequest.getTimeFormat().equals("am")) {
			cabBookingTime = cabBookingRequest.getPickUpTime();
		} else {
			cabBookingTime = 12 + cabBookingRequest.getPickUpTime();
		}
		totalCabReachTime = (timeRequiredInMinutes / 60) + hour;
		if ((cabBookingTime - totalCabReachTime) * 60 > NitroCabConstants.NITRO_CAB_PICKUP_TIME_DIF)
			isReachable = Boolean.TRUE;
		return isReachable;
	}

	/**
	 * This method calculate the profit earn by cab to this ride
	 * 
	 * @param nitroCab
	 * @param cabBookingRequest
	 * @return
	 */
	public double calculateProfitPer(final NitroCab nitroCab, final CabBookingRequest cabBookingRequest) {
		cabService = new NitroCabServiceImpl();
		cabCommand = new CalculateProfitPercentageCommand(cabService);
		return cabCommand.calculateProfit(nitroCab, cabBookingRequest);
	}


	@Override
	public Map<String, NitroCab> getSuitableCab(List<NitroCab> availableCab, List<CabBookingRequest> bookingRequests) {
		Map<String, NitroCab> cabBookingMap = new HashMap<>();
		for (NitroCab nitroCab : availableCab) {
			for (CabBookingRequest cabBookingRequest : bookingRequests) {
				if (isReachableToPickUpOnTime(nitroCab, cabBookingRequest)) {
					double profitOnThisRide = calculateProfitPer(nitroCab, cabBookingRequest);
					if (profitOnThisRide > 20) {
						NitroCab existingCab = cabBookingMap.get(nitroCab.getBookingId());
						if (null != existingCab) {
							if (existingCab.getProfitPercentage() > profitOnThisRide) {
								continue;
							}
						}
						nitroCab.setProfitPercentage(profitOnThisRide);
						nitroCab.setBookingId(cabBookingRequest.getBookingId());
						cabBookingMap.put(nitroCab.getCabNo(), nitroCab);
					}
				}
			}
		}

		return cabBookingMap;
	}

}
