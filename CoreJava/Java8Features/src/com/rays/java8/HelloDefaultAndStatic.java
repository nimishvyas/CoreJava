package com.rays.java8;

public interface HelloDefaultAndStatic {

	public default void defMethod() {
		System.out.println("Default method");
	}
	
	public static void statMethod() {
		System.out.println("Static method");
	}
}
