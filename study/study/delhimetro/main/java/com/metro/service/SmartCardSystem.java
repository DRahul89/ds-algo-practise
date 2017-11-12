package main.java.com.metro.service;

import java.util.List;

import main.java.com.metro.model.SmartCardDTO;

/**
 * Interface define the functionality of smart card system
 *
 */
public interface SmartCardSystem {
	
	public void swipeIn(final SmartCardDTO smartCardDTO);
	
	public void swipeOut(final SmartCardDTO smartCardDTO);

	public List<SmartCardDTO> perCardReport(final String cardId);

}
