package com.allianz.oop.homework.moveable;

public class MoveablePoint {
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	
	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MoveablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	public void moveUp() {
		y += 1;
		System.out.println("UP!");
	}
	
	public void moveDown() {
		y -= 1;
		System.out.println("DOWN!");
	}
	
	public void moveLeft() {
		x -= 1;
		System.out.println("LEFT!");
	}
	
	public void moveRight() {
		x += 1;
		System.out.println("RIGHT!");
	}
	
}
