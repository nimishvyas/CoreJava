package com.rays.oop.inheritance;

public class TestPerson {

	public static void main(String[] args) {
		
		Businessman b1 = new Businessman();
		
		b1.setName("Nimish Vyas");
		b1.setAddress("Kalani Nagar");
		b1.setIncome(120000.0);
		
		System.out.println("Name of businessman: " + b1.getName());
		System.out.println("Address: " + b1.getAddress());
		System.out.println("Income: " + b1.getIncome());
	}
}
