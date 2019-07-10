package com.vilt.models;

public class AsideArticle {

	private String title;
	private String text;

	public AsideArticle(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
