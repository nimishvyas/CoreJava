package com.rays.basics;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int r = 0;
		int n= number;
		int sum= 0;
		while ( n> 0) {
			r = n %10;
			sum= sum + (r*r*r);
			n = n/10;
		}
		if (sum==number) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
	
}
