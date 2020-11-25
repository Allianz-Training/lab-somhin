package com.allianz.algorithm;

public class ControlFlow {
	public static void main(String[] args) {
		if1();
		switch1();
		lab61();
		lab62();

		lab8();
		lab9();
		lab10();
		System.out.println("Senator " + lab11(200, 60) + " person.");
		lab11void();
	}

	public static void if1() {
		int score = 100;
		boolean isHandSome = false;
		if (score >= 80 || isHandSome) {
			System.out.println("GOOD!");
		} else if ((score >= 50) && (score < 80)) {
			System.out.println("Normal.");
		} else if (score < 50) {
			System.out.println("Fail!");
		}
	}

	public static void switch1() {
		int grade = 60;
		switch (grade) {
		case 80:
			System.out.println("Grade A");
			break;
		case 70:
			System.out.println("Grade B");
			break;
		case 60:
			System.out.println("Grade C");
			break;
		case 50:
			System.out.println("Grade D");
			break;
		case 40:
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Grade E");
		}
	}

	public static void lab61() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
	}

	public static void lab62() {
		int sum = 1;
		int i = 1;
		do {
			sum += i;
			System.out.println(sum + " + " + i + " = " + sum);
			i++;

		} while (i <= 10);
	}

	public static void lab8() {

		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println("Prayuth 11 ended");
				break;
			}
			System.out.println("Prayuth " + count);
		}
	}

	public static void lab9() {
		for (int count = 0; count <= 20; count++) {

			if (count == 11)
				continue;
			System.out.println("Taksin " + count);
		}
	}
	
	public static void lab10() {
		for (int i = 1; i <= 10; i++) {
			if (i == 2) continue;
			System.out.println("Number " + i);
		}
		
	}
	
	public static int lab11(int x, int y) {
		return x + y;
	}
	public static void lab11void() {
		System.out.println("Prawit");
	}
}
