package com.allianz.oop.homework.moveable;

public class MoveableRectangle {
	private MoveablePoint topLeft;
	private MoveablePoint bottomRight;

	public MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topLeft = new MoveablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MoveablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public String toString() {
		return "MoveableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
	}

	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}
}
