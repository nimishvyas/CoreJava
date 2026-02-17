package com.rays.basics;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=15;
		int a= 0;
		int b= 1;
		System.out.println("Fibonacci Series of " + n +" Terms is:");
		for (int i= 1; i<=n; i++) {
			System.out.println(a);
			int c = a+b;
			a=b;
			b=c;
		}
	} 
}
