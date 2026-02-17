package com.rays.basics;

public class LargestArrNum {
	public static void main(String[] args) {
		int[] intArray = {4,8,90,20,50};
		int largestNo = intArray[0];
		int secLargestNo= intArray[0];
		for (int i=0; i< intArray.length; i++) {
			if (intArray[i]> largestNo) {
				largestNo= intArray[i];
			}
		}
		System.out.println("The Largest No is "+ largestNo);
		for (int i=0; i< intArray.length; i++) {
			if (intArray[i]> secLargestNo && intArray[i] < largestNo) {
				secLargestNo= intArray[i];
			}
		}
		System.out.println("The Second Largest No is "+ secLargestNo);
	}

}
