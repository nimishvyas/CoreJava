package com.rays.basics;

public class LargestNoIntArray {
	public static void main (String[] args) {
		int[] intArray= {5, 10, 15, 6, 20, 14};
		int largestNo = intArray[0];
		for (int i=0; i < intArray.length; i++) {
			if (intArray[i]> largestNo) {
				largestNo= intArray[i];
			}
		}
		System.out.println(largestNo);
	}
}
