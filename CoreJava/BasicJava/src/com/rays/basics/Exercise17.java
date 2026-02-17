package com.rays.basics;

public class Exercise17 {
	public static void main(String[] args) {
		int[] arrayA= {2,4,5,8};
		int[] arrayB= {2,4,5,9};
		int missingNo= 0;
		for (int i= 0; i< arrayA.length; i++) {
			if (arrayA[i]==arrayB[i]) {
				missingNo=0;
			}
			else {
				missingNo = arrayA[i];
				System.out.println("The missing number is "+ missingNo);
			}
		}
	}

}
