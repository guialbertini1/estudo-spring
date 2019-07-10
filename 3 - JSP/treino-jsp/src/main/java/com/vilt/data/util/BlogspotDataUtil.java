package com.vilt.data.util;

import java.util.ArrayList;
import java.util.List;

import com.vilt.models.Blogspot;

public class BlogspotDataUtil {

	public static List<Blogspot> getBlogspot() {
		List<Blogspot> blogspot = new ArrayList<>();

		blogspot.add(new Blogspot("E-Sports latest news", "July 1, 2019", "Guilherme",
				"Activision Blizzard has revealed two new franchises for its upcoming Call of Duty League, Nike has gotten more involved in esports, The International 2019’s prize pool is soaring, and ESL One Hamburg just got even more exciting. Here are this week in esports’ biggest, best, and most surprising stories.",
				"<p><b>Immortals and WISE Ventures secure Call of Duty franchise slots</b></p><p>Activision Blizzard unveiled two new franchises, and the owners behind them, for its upcoming Call of Duty League.</p><p>Immortals Gaming Club has secured the Los Angeles franchise and WISE Ventures has purchased the Minnesota slot. This takes the current total of announced franchises to seven.</p><p><b>Nike enters multi-year partnership with FURIA</b></p><p>Brazilian esports organisation FURIA revealed that its latest partnership is with multinational sportswear brand Nike.</p><p>The partnership will activate over the next “few years,” commencing with the debut of their newest uniforms this week at ESL One Cologne.<p><p><b>The International 2019 prize pool surpasses last year’s record</b></p><p>The International 2019 has already gained the biggest prize pool in Dota 2 history with eight weeks remaining before the event kicks off.</p><p>The crowd-funded prize pool for the tournament, which begins its main event on August 20th, is sitting above $25.6 million (£20.3 million) with over 50 days still to go.</p>"));

		return blogspot;
	}

}
