package com.allianz.abstract__enum;

public abstract class Creatures {
	public int i = 1;
	public abstract void move();
	public abstract void eat();
	
	public void stand() {
		System.out.println("stand");
	}
}
