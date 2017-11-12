package main.java.com.nitro.cab.business;

import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;

/**
 * An interface for all cab related commands
 * 
 *
 */
public interface CabCommand {

	public int calculateDistance(final NitroCab nitroCab, final CabBookingRequest cabBookingRequest);

	public int calculateTime(final NitroCab nitroCab, final CabBookingRequest cabBookingRequest);

	public double calculateProfit(final NitroCab nitroCab, final CabBookingRequest cabBookingRequest);

}
