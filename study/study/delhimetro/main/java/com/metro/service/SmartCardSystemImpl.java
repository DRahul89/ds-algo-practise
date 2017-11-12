package main.java.com.metro.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.metro.business.MetroStation;
import main.java.com.metro.business.SmartCardCommand;
import main.java.com.metro.business.SwipeInCommand;
import main.java.com.metro.business.SwipeOutCommand;
import main.java.com.metro.dao.SmartCardDAO;
import main.java.com.metro.exceptions.BalanceException;
import main.java.com.metro.model.SmartCard;
import main.java.com.metro.model.SmartCardDTO;

public class SmartCardSystemImpl implements SmartCardSystem {

	private SmartCardDAO smartCardDAO;

	public SmartCardSystemImpl(final SmartCardDAO smartCardDAO) {
		this.smartCardDAO = smartCardDAO;
	}

	@Override
	public void swipeIn(SmartCardDTO smartCardDTO) {
		try {
			SmartCardCommand smartCardCommand = new SwipeInCommand();
			MetroStation metroStation = new MetroStation(smartCardCommand);
			smartCardDTO = metroStation.executeCommand(smartCardDTO);
			smartCardDAO.saveCard(smartCardDTO.convertFromDtoToDao());
		} catch (BalanceException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void swipeOut(SmartCardDTO smartCardDTO) {
		try {
			SmartCardCommand smartCardCommand = new SwipeOutCommand();
			MetroStation metroStation = new MetroStation(smartCardCommand);
			metroStation.executeCommand(smartCardDTO);
			smartCardDAO.saveCard(smartCardDTO.convertFromDtoToDao());
		} catch (BalanceException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<SmartCardDTO> perCardReport(String cardId) {
		List<SmartCard> smartCardInfo = smartCardDAO.getCardInfo(cardId);
		List<SmartCardDTO> smartCardDTOs = new ArrayList<>();
		for (SmartCard smartCard : smartCardInfo) {
			smartCardDTOs.add(smartCard.convertFromDaoToDTO());
		}
		return smartCardDTOs;
	}

}
