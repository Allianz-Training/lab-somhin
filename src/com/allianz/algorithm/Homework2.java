package com.allianz.algorithm;

public class Homework2 {
	public static void main(String[] args) {
//		String[][] table = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
//		multiplyTable(table);
	}

	public static void multiplyTable(String[][] table) {
		int[][] intGrid = new int[3][3];
		for (int i = 0; i < intGrid.length; i++) {
			for (int j = 0; j < intGrid.length; j++) {
				intGrid[i][j] = Integer.parseInt(table[i][j]);
			}
		}
		for (int i = 0; i < intGrid.length; i++) {
			for (int j = 0; j < intGrid.length; j++) {
				System.out.print((intGrid[i][j] * 2));
				if (j!=intGrid[i].length) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
	
}
