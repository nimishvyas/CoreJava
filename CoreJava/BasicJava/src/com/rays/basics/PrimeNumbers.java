package com.rays.basics;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n= 13;
		int count= 0;
		for (int i= 2; i<n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
	

}
