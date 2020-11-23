package com.allianz.somhin;

public class HelloWorld {
	public static void main(String[] args) {

		/*
		 * comment multiple line
		 */

		// comment single line
		conversion();
		bark();
	}

	public static void bark() {
		String dogName = "Prayuth";
		System.out.println("dog name's " + dogName + " is barking!");
	}

	public static void conversion() {

		int NumberOf = 23;
		boolean IsItTrue = true;
		String CheckDate = "Today is monday of ";

		System.out.println(CheckDate + NumberOf + " and it's " + IsItTrue);

		int myInt = 5;
		float myFloat = myInt;
		System.out.println("myInt: " + myInt);
		System.out.println("myFLoat: " + myFloat);

		double myDouble = 10;
		float doubFloat = (float) myDouble;
		System.out.println("myDouble: " + myDouble);
		System.out.println("myFloat: " + doubFloat);

		char myChar = 'P';
		int IntFromChar = (int) myChar;
		System.out.println("myChar: " + myChar);
		System.out.println("IntFromChar: " + IntFromChar);

	}
}
