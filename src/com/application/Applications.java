package com.application;

public class Applications
{
	private String name;
	private String category;
	private int downloads;
	private int reviews;
	

	
	public Applications(String name, String category, int downloads, int reviews) 
	{
		this.name = name;
		this.category= category;
		this.downloads = downloads;
		this.reviews = reviews;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "Applications [name=" + name + ", category=" + category + ", downloads=" + downloads + ", reviews="
				+ reviews + "]";
	}
	

}
