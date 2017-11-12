package main.java.com.nitro.cab.business;

import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;
import main.java.com.nitro.cab.service.CabService;

public class CalculateProfitPercentageCommand implements CabCommand {

	private CabService cabService;

	public CalculateProfitPercentageCommand(final CabService cabService) {
		this.cabService = cabService;
	}

	@Override
	public double calculateProfit(NitroCab nitroCab, CabBookingRequest cabBookingRequest) {
		CabCommand cabCommand = new CalculateInitialToPickUpDistanceCommand(cabService);
		int initialToPickUpdist = cabCommand.calculateDistance(nitroCab, cabBookingRequest);
		cabCommand = new CalculatePickUpToDropDistanceCommand(cabService);
		int pickUpToDropDist = cabCommand.calculateDistance(nitroCab, cabBookingRequest);
		return cabService.calculateProfitPercentage(initialToPickUpdist, pickUpToDropDist);
	}

	@Override
	public int calculateDistance(NitroCab nitroCab, CabBookingRequest cabBookingRequest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateTime(NitroCab nitroCab, CabBookingRequest cabBookingRequest) {
		// TODO Auto-generated method stub
		return 0;
	}
}
