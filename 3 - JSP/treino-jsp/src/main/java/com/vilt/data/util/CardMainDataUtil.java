package com.vilt.data.util;

import com.vilt.models.CardMain;

public class CardMainDataUtil {
	
	public static CardMain getCardMain(){
		CardMain cardMain = new CardMain("Terraria update!",
				"Since the updates described here have not been released yet, "
				+ "and many of these details are only conjectured based on comments "
				+ "or screenshots provided by the staff, all items here may be "
				+ "subject to change, or may not end up in a future Terraria update at all.");
						
		return cardMain;
	}

}
