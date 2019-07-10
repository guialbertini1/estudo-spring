package com.vilt.data.util;

import java.util.ArrayList;
import java.util.List;

import com.vilt.models.CardSub;

public class CardSubDataUtil {

	public static List<CardSub> getCardSub(){
		List<CardSub> cardSub = new ArrayList<>();
		cardSub.add(new CardSub("FPS", "CS:GO", "Jul 5", "Liquid beat NRG; secure semi-final spot in Cologne", "Thumbnail"));
		cardSub.add(new CardSub("Point-and-Click", "Fran Bow", "Jul 2", "Fran Bow is a creepy adventure game that tells the story of Fran, a young...", "Thumbnail"));
		return cardSub;
	}
	
}
