package com.rays.basics;

public class Diamon2 {
	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int j = i; j < rows; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
			System.out.println();
		}

		for (int i = rows - 1; i >= 1; i--) {

			for (int j = rows; j > i; j--) {
				System.out.print("\t");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
			System.out.println();
		}

	}
}
