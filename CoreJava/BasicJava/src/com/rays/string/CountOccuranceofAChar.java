package com.rays.string;

public class CountOccuranceofAChar {
	public static void main(String[] args) {
		String str = "Google";
		int count = 0;
		char c= 'o'; 
		for (int i = 0; i< str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("coutn of char o: " + count);
	}
}
