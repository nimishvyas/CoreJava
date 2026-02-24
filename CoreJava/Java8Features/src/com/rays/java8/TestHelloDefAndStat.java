package com.rays.java8;

public class TestHelloDefAndStat {

	public static void main(String[] args) {
		HelloDefaultAndStatic.statMethod();
		HelloDefaultAndStatic h = new HelloDefaultAndStatic() {
		};
		
		h.defMethod();
	}
}
