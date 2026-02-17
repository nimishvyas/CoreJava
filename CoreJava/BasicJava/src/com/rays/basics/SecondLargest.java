package com.rays.basics;

public class SecondLargest {
	public static void main (String[] args) {
		int[] intArray= {5, 10, 15, 6, 20, 14};
		int largestNo = intArray[0];
		int secLargestNo = intArray[0];
		for (int i=0; i < intArray.length; i++) {
			int current= intArray[i];
			if (current > largestNo) {
				secLargestNo= largestNo;
				largestNo= current;
			}
			else if (current > secLargestNo && current<largestNo ) {
				secLargestNo = current;
			}
		}
		System.out.println(largestNo);
		System.out.println(secLargestNo);
	}
}
