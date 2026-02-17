package com.rays.oop.constructor;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		Person p2 = new Person("Ritik", "Boston");
		
		System.out.println(p2.getName());
		System.out.println(p2.getAddress());
	}
}
