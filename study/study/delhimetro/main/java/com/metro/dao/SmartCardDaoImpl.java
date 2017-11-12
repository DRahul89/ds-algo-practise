package main.java.com.metro.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.metro.model.SmartCard;

public class SmartCardDaoImpl implements SmartCardDAO {

	private Map<String, SmartCard> smartCards = new HashMap<>();

	@Override
	public void saveCard(SmartCard smartCard) {
		smartCards.put(smartCard.getJourneyId(), smartCard);

	}

	@Override
	public List<SmartCard> getCardInfo(String smartCardId) {
		List<SmartCard> cardInfoList = new ArrayList<>(smartCards.values());
		List<SmartCard> cardList = new ArrayList<>();
		for (SmartCard smartCard : cardInfoList) {
			if (smartCard.getCardId().equals(smartCardId)) {
				cardList.add(smartCard);
			}
		}
		return cardList;

	}

	@Override
	public List<SmartCard> getAll() {
		return new ArrayList<>(smartCards.values());
	}

}
