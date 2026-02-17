package com.rays.oop.overloading;

public class Sum {

	public int sum(int i, int j) {
		return i+j;
	}
	
	public int sum (int i , int j , int k) {
		return i+j+k;
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		
		System.out.println(s.sum(5, 10));
		System.out.println(s.sum(5, 10, 20));
	}
}
