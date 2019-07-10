package com.vilt.models;

public class CardSub {

	private String category;
	private String title;
	private String date;
	private String text;
	private String thumbnail;

	public CardSub(String category, String title, String date, String text, String thumbnail) {
		super();
		this.category = category;
		this.title = title;
		this.date = date;
		this.text = text;
		this.thumbnail = thumbnail;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
