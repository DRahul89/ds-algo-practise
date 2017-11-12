package main.java.com.nitro.cab.serviceimpl;

import main.java.com.nitro.cab.constants.NitroCabConstants;
import main.java.com.nitro.cab.service.CabService;

public class NitroCabServiceImpl implements CabService {

	@Override
	public int calculateDistance(int source, int destination) {
		return Math.abs(destination - source) * NitroCabConstants.DISTANCE_AREA_CODE;
	}

	@Override
	public int calculateTime(int source, int destination) {
		return Math.abs(destination - source) * NitroCabConstants.NITRO_TRAVEL_TIME_PERKM;
	}

	@Override
	public double calculateProfitPercentage(int initialToPicUp, int pickUpToDrop) {
		double investment = (initialToPicUp + pickUpToDrop) * NitroCabConstants.NITRO_CAB_INCURS_PERKM;
		double earning = pickUpToDrop * NitroCabConstants.NITRO_CAB_CHARGE_PERKM;
		double profit = (earning - investment) / investment * 100;
		return profit;
	}

}
