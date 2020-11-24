package com.allianz.somhin;

public class String__Arrays {
	public static void main(String[] args) {

	}

	public static void lab1() {
		char[] myChar = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
		String myWorld = new String(myChar);
		System.out.println(myWorld);
	}

	public static void stringContain() {
//		check contain
		String name = "Somfuckinghin";
//		String check = "hin";
		String check2 = "somhin";
		System.out.println(name.contains(check2));
	}

	public static void testSubString() {
//		cut certain index of word
		String word = "Java is hell!";
		System.out.println(word.substring(8, 13));
	}

	public static void trimTest() {
//		trim prefix and suffix
		String mySpaceWord = "  VOLLA !  ";
		System.out.println(mySpaceWord + " length: " + mySpaceWord.length());
		String trimWord = mySpaceWord.trim();
		System.out.println(trimWord + " length: " + trimWord.length());
	}

//	
//	LAB12 SECTION
//	

//	public static void lab12() {
//		String string1 = "You and Me";
//		String string2 = " you and me ";

//		1. compare
//		if (string1.equals(string2)) {
//			System.out.println("equal!");
//		} else {
//			System.out.println("not equal.");
//		}

//		2. find contain
//		String containTest1 = "you";
//		System.out.println(string1.contains(string2));
//		System.out.println(string1.contains(containTest1));
//		System.out.println(string2.contains(containTest1));

//		3. find length
//		System.out.println(string1.length());
//		System.out.println(string2.length());

//		4. subtract string
//		System.out.println(string1.substring(0, 2));

//		5. trim prefix suffix
//		System.out.println(string2.trim());

//		6. UPPERCASE
//		System.out.println(string1.toUpperCase());

//		7. method chaining
//		System.out.println(string2.toUpperCase().trim());
//	}

//	
//	Lab13 Section
//	
//	public static void twoDArray() {
//		int[][] twoD_Array = { { 1, 2, 3, 4 }, { 4, 14, 2, 5, 5 }, { 7, 3, 4 }, { 1 } };
//
//		int sum = 0;
//		int indexRow = 0;
//		for (int[] row : twoD_Array) {
//
//			int indexCol = 0;
//			for (int column : row) {
//				System.out.print(column + " ");
//				if (column == twoD_Array.length - 1) {
//					sum = sum + row[indexCol];
//				}
//				indexCol++;
//			}
//			indexRow++;
//
//			System.out.println();
//		}
//		System.out.println("Total sum is: " + sum);
//	}
}
