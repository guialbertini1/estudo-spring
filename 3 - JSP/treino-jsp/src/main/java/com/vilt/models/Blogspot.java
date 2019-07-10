package com.vilt.models;

public class Blogspot {

	private String title;
	private String date;
	private String author;
	private String introduction;
	private String text;

	public Blogspot(String title, String date, String author, String introduction, String text) {
		super();
		this.title = title;
		this.date = date;
		this.author = author;
		this.introduction = introduction;
		this.text = text;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
