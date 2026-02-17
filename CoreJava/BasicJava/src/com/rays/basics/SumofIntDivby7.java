package com.rays.basics;

public class SumofIntDivby7 {
	public static void main(String[] args) {
		int c=0;
		for (int i =101; i<200; i++) {
			if (i%7==0) {
				c = c+i;
			}
			}
		System.out.println("The sum of numbers is " + c);
	}
}
