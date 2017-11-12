package main.java.com.metro.business;

import main.java.com.metro.exceptions.BalanceException;
import main.java.com.metro.model.SmartCardDTO;

public interface SmartCardCommand {

	public SmartCardDTO executeCommand(final SmartCardDTO smartCardDTO) throws BalanceException;
}
