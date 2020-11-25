package com.allianz.algorithm;

public class Homework1 {
	public static void main(String[] args) {
//		draw1(100);
//		draw2(2);
//		draw3(3);
//		draw4(3);
//		draw5(3);
//		draw6(4);
//		draw7(5);
//		draw8(3);
	}

	public static int draw1(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		return n;
	}

	public static void draw2(int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += "*";
		}

		for (int num = 0; num < n; num++) {
			System.out.println(result);
		}
	}

	public static void draw3(int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result += i;
		}

		for (int k = 0; k < n; k++) {
			System.out.println(result);
		}
	}

	public static void draw4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void draw5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void draw6(int n) {
		for (int i = n; i >= 1; i--) {
			for (int k = 1; k <= n; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void draw7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1 + n * (i - 1); k <= n * i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void draw8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1 + n * (i - 1); k <= n * i; k++) {
				System.out.print(n * n - k + 1);
			}
			System.out.println();
		}
	}
}
