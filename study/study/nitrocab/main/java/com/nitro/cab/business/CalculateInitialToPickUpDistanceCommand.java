package main.java.com.nitro.cab.business;

import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;
import main.java.com.nitro.cab.service.CabService;

public class CalculateInitialToPickUpDistanceCommand implements CabCommand {

	private CabService cabService;

	public CalculateInitialToPickUpDistanceCommand(final CabService cabService) {
		this.cabService = cabService;
	}

	@Override
	public int calculateDistance(NitroCab nitroCab, CabBookingRequest cabBookingRequest) {
		return cabService.calculateDistance(nitroCab.getInitialLocation(), cabBookingRequest.getPickUpArea());
	}

	@Override
	public double calculateProfit(NitroCab nitroCab, CabBookingRequest cabBookingRequest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateTime(NitroCab nitroCab, CabBookingRequest cabBookingRequest) {
		// TODO Auto-generated method stub
		return 0;
	}

}
