package com.allianz.oop.homework.moveable;

import com.allianz.oop.homework.Circle;
import com.allianz.oop.homework.Employee;
import com.allianz.oop.homework.Rectangle;

public class Sailor {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2 = new Circle(2.5);
		
		System.out.println("Hw5-6 OOP1 ==================");
		System.out.println(circle);
		System.out.println("Circle area: " + circle.getArea());
		System.out.println("Circle circumference: " + circle.getCircumference());
		System.out.println(circle2);
		System.out.println("Circle area: " + circle2.getArea());
		System.out.println("Circle circumference: " + circle2.getCircumference());

		System.out.println("\n\nHw7 OOP1 ==================");
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle(5, 8);
		System.out.println(rectangle);
		System.out.println("Rectangle area: " + rectangle.getArea());
		System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
		System.out.println(rectangle2);
		System.out.println("Rectangle area: " + rectangle2.getArea());
		System.out.println("Rectangle perimeter: " + rectangle2.getPerimeter());

		System.out.println("\n\nHw8 OOP1 ==================");
		Employee employee = new Employee(1, "John", "Doe", 10000);
		System.out.println(employee);
		System.out.println("Annual Salary: " + employee.getAnnualSalary());
		System.out.println("Raise Salary from " + employee.getSalary() + " to: " + employee.raiseSalary(50));

		System.out.println("\n\nHw1 OOP2 ==================");
		MoveableCircle moveableCircle = new MoveableCircle(1, 1, 5, 5, 8);
		System.out.println(moveableCircle);
		moveableCircle.moveDown();
		System.out.println(moveableCircle);
		System.out.println("\n\nHw2 OOP2 ==================");
		MoveableCircle movableRectangle = new MoveableCircle(1, 1, 2, 2, 6);
		System.out.println(movableRectangle);
		movableRectangle.moveLeft();
		System.out.println(movableRectangle);
	}
}
