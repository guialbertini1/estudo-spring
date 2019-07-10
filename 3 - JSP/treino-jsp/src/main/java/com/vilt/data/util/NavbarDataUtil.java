package com.vilt.data.util;

import java.util.ArrayList;
import java.util.List;

import com.vilt.models.Navbar;

public class NavbarDataUtil {

	public static List<Navbar> getTexts(){
		List<Navbar> navbar = new ArrayList<>();
		navbar.add(new Navbar("FPS"));
		navbar.add(new Navbar("RTS"));
		navbar.add(new Navbar("MMORPG"));
		navbar.add(new Navbar("Strategy"));
		navbar.add(new Navbar("Point-and-Click"));
		navbar.add(new Navbar("Sandbox"));
		navbar.add(new Navbar("Terror"));
		navbar.add(new Navbar("2D"));
		navbar.add(new Navbar("Pixel"));
		return navbar;
	}
	
}
