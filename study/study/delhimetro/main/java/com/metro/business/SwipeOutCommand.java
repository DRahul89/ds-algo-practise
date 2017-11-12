package main.java.com.metro.business;

import java.util.Calendar;

import main.java.com.metro.enums.FairMappingEnum;
import main.java.com.metro.enums.MetroStationEnum;
import main.java.com.metro.exceptions.BalanceException;
import main.java.com.metro.model.SmartCardDTO;

public class SwipeOutCommand implements SmartCardCommand {

	private int dayOfWeek = Calendar.DAY_OF_WEEK;

	@Override
	public SmartCardDTO executeCommand(SmartCardDTO smartCardDTO) throws BalanceException {
		try {
			double aplicableFair = 0;
			System.out.println("Swipe out to station " + smartCardDTO.getTostation());
			Thread.sleep(2000);
			System.out.println("Started journey from station  " + smartCardDTO.getFromstation() + "  with balance  "
					+ smartCardDTO.getTotalBalance());
			if (dayOfWeek == 6 || dayOfWeek == 7) {
				aplicableFair = FairMappingEnum.Weekend.getFair();
			} else {
				aplicableFair = FairMappingEnum.WeekDay.getFair();
			}
			double fairAmount = aplicableFair * MetroStationEnum.valueOf(smartCardDTO.getFromstation())
					.calculateDistance(MetroStationEnum.valueOf(smartCardDTO.getTostation()));

			System.out.println("Fair calculated for travel " + fairAmount);
			smartCardDTO.setTotalBalance(smartCardDTO.getTotalBalance() - fairAmount);
			System.out.println("remaining balance " + smartCardDTO.getTotalBalance());
			if (smartCardDTO.getTotalBalance() < 0) {
				throw new BalanceException("Balance is not enougph for this journey");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return smartCardDTO;

	}

}
