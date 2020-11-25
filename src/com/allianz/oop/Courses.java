package com.allianz.oop;

public class Courses implements ProductFrontPage {
	public String title;
	public String price;
	public String urlImage;
	public String instructor;
	public int NumTotal;
	public String NumSold;

	public Courses(String title, String price, String urlImage, String instructor, int numTotal, String numSold) {
		super();
		this.title = title;
		this.price = price;
		this.urlImage = urlImage;
		this.instructor = instructor;
		NumTotal = numTotal;
		NumSold = numSold;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getPrice() {
		return price;
	}

	@Override
	public String getUrlImage() {
		return urlImage;
	}

	@Override
	public String getSoldAmnt() {
		// TODO Auto-generated method stub
		return NumSold;
	}

}
