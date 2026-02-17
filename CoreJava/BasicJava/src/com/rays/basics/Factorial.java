package com.rays.basics;

public class Factorial {
	public static void main(String[] args) {
		int a= 13;
		System.out.println("The factors are");
		for (int i= 2; i < a; i++) {
			if (a%i==0) {
				System.out.println(i);
			}
		}
			System.out.println("1\n" + a);
	} 
}
