package com.allianz.abstract__enum;

public class Dawg extends Creatures {
	public Creatures__Enum.Dawg__Status type;
	public String name;
	
	public Dawg(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void move() {
		System.out.println("WALK WALK WALK");
	}

	@Override
	public void eat() {
		System.out.println("YUM YUM YUM");		
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
