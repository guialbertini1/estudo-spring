package com.vilt.data.util;

import java.util.ArrayList;
import java.util.List;

import com.vilt.models.AsideArchive;

public class AsideArchiveDataUtil {

	public static List<AsideArchive> getAsideArchive(){
		List<AsideArchive> asideArchive = new ArrayList<>();
		asideArchive.add(new AsideArchive("November 2018"));
		asideArchive.add(new AsideArchive("December 2018"));
		asideArchive.add(new AsideArchive("January 2019"));
		asideArchive.add(new AsideArchive("February 2019"));
		asideArchive.add(new AsideArchive("March 2019"));
		asideArchive.add(new AsideArchive("April 2019"));
		asideArchive.add(new AsideArchive("May 2019"));
		asideArchive.add(new AsideArchive("June 2019"));
		asideArchive.add(new AsideArchive("July 2019"));
		return asideArchive;
	}
	
}
