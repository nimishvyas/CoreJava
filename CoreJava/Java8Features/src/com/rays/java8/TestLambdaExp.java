package com.rays.java8;

public class TestLambdaExp {

	public static void main(String[] args) {
		
		HelloFunctionalInterface fi = () -> {
			System.out.println("hello lambda exp");
		};
		fi.say();
	}
}
