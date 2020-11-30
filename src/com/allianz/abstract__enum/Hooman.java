package com.allianz.abstract__enum;

public class Hooman extends Creatures {

	@Override
	public void move() {
		System.out.println("WALK!");
	}

	@Override
	public void eat() {
		System.out.println("CONSUME!");
	}

}
