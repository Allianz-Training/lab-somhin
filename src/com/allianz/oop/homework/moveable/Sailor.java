package com.allianz.oop.homework.moveable;

import com.allianz.oop.homework.Circle;
import com.allianz.oop.homework.Employee;
import com.allianz.oop.homework.Rectangle;

public class Sailor {
	public static void main(String[] args) {
		Circle c1 = new Circle(260);
		System.out.println(c1.getArea());
		
		Rectangle r1 = new Rectangle(260, 250);
		System.out.println(r1.getArea());
		
		Employee e1 = new Employee(0, "Prayuth", "Chan O Cha", 100000);
		System.out.println(e1.raiseSalary(30));
		
		MoveableRectangle MR1 = new MoveableRectangle(11, 22, 33, 44, 10, 10);
		System.out.println(MR1.toString());
	}
}
