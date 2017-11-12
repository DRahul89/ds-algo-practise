package main.java.com.metro.test;

import java.util.List;

import main.java.com.metro.dao.SmartCardDAO;
import main.java.com.metro.dao.SmartCardDaoImpl;
import main.java.com.metro.model.SmartCardDTO;
import main.java.com.metro.service.SmartCardSystem;
import main.java.com.metro.service.SmartCardSystemImpl;

public class SmartCardTest {

	public static void main(String[] args) {
		SmartCardDAO smartCardDAO = new SmartCardDaoImpl();
		SmartCardSystem smartCardSystem = new SmartCardSystemImpl(smartCardDAO);

		System.out.println("-------------First journey--------------------");
		SmartCardDTO smartCardDTO = new SmartCardDTO();
		smartCardDTO.setCardId("1234");
		smartCardDTO.setFromstation("A1");
		smartCardDTO.setTostation("A5");
		smartCardDTO.setJourneyId("1");
		smartCardDTO.setTotalBalance(60);
		smartCardSystem.swipeIn(smartCardDTO);
		smartCardSystem.swipeOut(smartCardDTO);
		System.out.println("--------------First journey ends ------------");

		System.out.println("-------------second journey---------------");
		smartCardDTO.setFromstation("A1");
		smartCardDTO.setTostation("A3");
		smartCardDTO.setJourneyId("2");
		smartCardSystem.swipeIn(smartCardDTO);
		smartCardSystem.swipeOut(smartCardDTO);
		System.out.println("-------------second journey ends---------------");
		System.out.println();
		System.out.println();
		System.out.println("print report for card id " + smartCardDTO.getCardId());
		List<SmartCardDTO> smartCardDTOs = smartCardSystem.perCardReport(smartCardDTO.getCardId());
		for (SmartCardDTO smCardDTO : smartCardDTOs)
			System.out.println(smCardDTO);
	}
}
