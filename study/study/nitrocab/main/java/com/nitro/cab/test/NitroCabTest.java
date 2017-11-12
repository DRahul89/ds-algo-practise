package main.java.com.nitro.cab.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import main.java.com.nitro.cab.business.CabBookingFacade;
import main.java.com.nitro.cab.business.NitroCabBookingFacadeImpl;
import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;

public class NitroCabTest {

	public static void main(String[] args) {
		List<NitroCab> nitroCabs = NitroCabTestData.getNitroCabs();
		List<CabBookingRequest> cabBookingrequests = NitroCabTestData.getNitroCabBookingRequest();
		CabBookingFacade cabBooking = new NitroCabBookingFacadeImpl();
		Map<String, NitroCab> cabMapping = cabBooking.getSuitableCab(nitroCabs, cabBookingrequests);
		Set<String> keySet = cabMapping.keySet();
		for (String key : keySet) {
			NitroCab nitroCab = cabMapping.get(key);
			System.out.print(key + "===");
			System.out.println(nitroCab);
		}

	}

}
