package com.allianz.oop;

public class Products implements ProductFrontPage {
	public String title;
	public String price;
	public String urlImage;
	public String soldText;

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
		return null;
	}

	@Override
	public String getSoldAmnt() {
		return soldText;
	}

}
