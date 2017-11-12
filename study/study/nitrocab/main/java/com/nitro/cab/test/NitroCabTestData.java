package main.java.com.nitro.cab.test;

import java.util.ArrayList;
import java.util.List;

import main.java.com.nitro.cab.model.CabBookingRequest;
import main.java.com.nitro.cab.model.NitroCab;

public class NitroCabTestData {
	
	
	public static List<NitroCab> getNitroCabs(){
		List<NitroCab> nitroCabs = new ArrayList<>();
		nitroCabs.add(new NitroCab("a", 100020));
		nitroCabs.add(new NitroCab("b", 100040));
		nitroCabs.add(new NitroCab("c", 100060));
		nitroCabs.add(new NitroCab("d", 100030));
		return nitroCabs;
	}
	
	public static List<CabBookingRequest> getNitroCabBookingRequest(){
		List<CabBookingRequest> bokingRequests = new ArrayList<>();
		bokingRequests.add(new CabBookingRequest("br1", 100025,100036,10,"am"));
		bokingRequests.add(new CabBookingRequest("br2", 100056,100042,11,"am"));
		bokingRequests.add(new CabBookingRequest("br3", 100044,100056,12,"pm"));
		bokingRequests.add(new CabBookingRequest("br4", 100028,100036,3,"pm"));
		return bokingRequests;
	}

}
