package com.allianz.oop.homework.moveable;

public class MoveableCircle  {
	private int radius;
	private MoveablePoint center;
	
	public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MoveablePoint(10, 20, 30, 40);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "MoveableCircle [radius=" + radius + ", center=" + center + "]";
	}
	
	public void moveUp() {
		center.moveUp();
	}
	
	public void moveDown() {
		center.moveDown();
	}
	
	public void moveLeft() {
		center.moveLeft();
	}
	
	public void moveRight() {
		center.moveRight();
	}
}
