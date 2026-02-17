package com.rays.string;

public class TestString {
	public static void main (String[] args) {
		String name = "Vijay Dinanath Chouhan";
		System.out.println("name: " + name);
		System.out.println("String length: " + name.length());
		System.out.println("7th Char is: " + name.charAt(6));
		System.out.println("first index of k: " + name.indexOf('k'));
		System.out.println("last index of k: " + name.lastIndexOf('k'));
		System.out.println(name.replace('a', 'b'));
		System.out.println("Lower case: " + name.toLowerCase());
		System.out.println("Upper case: " + name.toUpperCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("han"));
		System.out.println(name.substring(5,9));
	}

}
