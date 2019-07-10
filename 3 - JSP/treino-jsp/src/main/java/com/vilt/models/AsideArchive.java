package com.vilt.models;

import java.util.ArrayList;
import java.util.List;

public class AsideArchive {

	private String text;
	
	private List<AsideArchive> asideArchive = new ArrayList<>();
	public List<AsideArchive> getAsideArchive(){
		
		return asideArchive;
	}
	
	public AsideArchive(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
