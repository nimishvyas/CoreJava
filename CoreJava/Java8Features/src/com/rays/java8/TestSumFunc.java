package com.rays.java8;

public class TestSumFunc {

	public static void main(String[] args) {
		
		SumFuncInterface s = (i, j)-> {
			return i+j;
		};
		System.out.println(s.sum(5, 10));
	}
}
