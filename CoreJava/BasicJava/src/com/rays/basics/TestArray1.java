package com.rays.basics;

public class TestArray1 {
	
	public static void main( String[] args) {
		int[] table = {2,4,6,8};
		//System.out.println(table[2]);
		
		System.out.println(table.length);
		
		System.out.println("------");
		
		for (int i = 0; i < table.length; i++) {
			System.out.println(i + "=" + table[i]);
		}
	}

}
