package com.allianz.oop.homework;

public class Circle {
	private double radius = 1.0;
	@SuppressWarnings("unused")
	private String color = "red";
	
	public static void main(String[] args) {
		Circle circle1 = new Circle(3);
		System.out.println(circle1.getArea());
	}

	public Circle() {

	}

	public Circle(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + "]";
	}
	
}
