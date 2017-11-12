package main.java.com.metro.business;

import main.java.com.metro.exceptions.BalanceException;
import main.java.com.metro.model.SmartCardDTO;

public class SwipeInCommand implements SmartCardCommand {

	@Override
	public SmartCardDTO executeCommand(SmartCardDTO smartCardDTO) throws BalanceException {
		try {
			System.out.println("Swipe in for station " + smartCardDTO.getFromstation());
			Thread.sleep(2000);
			System.out.println("card Balance is " + smartCardDTO.getTotalBalance());
			if (smartCardDTO.getTotalBalance() < 50) {
				throw new BalanceException("Balance is less than 50 rupees");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return smartCardDTO;

	}

}
