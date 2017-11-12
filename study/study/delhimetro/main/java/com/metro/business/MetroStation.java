package main.java.com.metro.business;

import main.java.com.metro.exceptions.BalanceException;
import main.java.com.metro.model.SmartCardDTO;

public class MetroStation {

	private SmartCardCommand smartCardCommand;

	public MetroStation(final SmartCardCommand smartCardCommand) {
		this.smartCardCommand = smartCardCommand;
	}

	public SmartCardDTO executeCommand(final SmartCardDTO smartCardDTO) throws BalanceException {
		return smartCardCommand.executeCommand(smartCardDTO);
	}
}
