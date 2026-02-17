package com.rays.basics;

public class ReversePalindrome {
	public static void main(String[] args) {
		int number = 619;
		int r = 0;
		int n= number;
		int sum= 0;
		while ( n> 0) {
			r = n %10;
			sum= (sum*10)+ r;
			n = n/10;
		}
		if (sum==number) {
			System.out.println("Palindrome Number " + sum);
		}
		else {
			System.out.println("Reverse Number "+ sum);
		}
	}
}
