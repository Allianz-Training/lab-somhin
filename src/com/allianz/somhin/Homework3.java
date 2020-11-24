package com.allianz.somhin;

public class Homework3 {
	public static void main(String[] args) {
//		draw9(3);
//		draw10(3);
//		draw11(3);
//		draw12(5);
	}

	public static void draw9(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(2 * i);
		}
	}

	public static void draw10(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(2 * i);
		}
	}

	public static void draw11(int n) {
		int row = 0;
		while (row < n) {
			int col = 0;
			int sum = 0;
			row++;
			while (col < n) {
				sum = sum + row;
				System.out.print(sum + " ");
				col++;
			}
			System.out.println();
		}
	}

	public static void draw12(int n) {
		int row = 0;
		while (row < n) {
			int col = 0;
			while (col < n) {
				if (row == col)
					System.out.print("_");
				else
					System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
	
//	lol
	public static void draw13(int n) {
		int row = 0;
		int underscore = n;
		while (row < n) {
			underscore--;
			int col = 0;
			while (col < n) {
				if (underscore == col)
					System.out.print("_");
				else
					System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void draw14(int n) {
		int row = 0;
		int count = 0;
		while (row < n) {
			int col = 0;
			count++;
			while (col < n) {
				if (col >= count)
					System.out.print("_");
				else
					System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void draw15(int n) {
		int row = 0;
		int count = n;
		while (row < n) {
			int col = 0;
			while (col < n) {
				if (col >= count)
					System.out.print("_");
				else
					System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			count--;
		}
	}

	public static void draw16(int n) {
		draw14(n);
		int row = 0;
		int count = n - 1;
		while (row < n) {
			int col = 0;
			while (col < n) {
				if (col >= count && col != n)
					System.out.print("_");
				else
					System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			count--;
		}
	}

	public static void draw17(int n) {
		int row = 0;
		int count = 0;
		while (row < n) {
			int col = 0;
			row++;
			count++;
			while (col < n) {
				if (col >= count)
					System.out.print("-");
				else
					System.out.print(row);
				col++;
			}
			System.out.println();
		}
		row = 0;
		count = n - 1;
		while (row < n - 1) {
			int col = 0;
			while (col < n) {
				if (col >= count && col != n)
					System.out.print("-");
				else
					System.out.print(count);
				col++;
			}
			System.out.println();
			row++;
			count--;
		}
	}
}
