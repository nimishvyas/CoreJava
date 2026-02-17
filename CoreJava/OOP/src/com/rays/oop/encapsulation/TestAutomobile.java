package com.rays.oop.encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile c1 = new Automobile();
		
		c1.setColor("Midnight Black");
		c1.setSpeed(80);
		c1.setMake("SUV");
		
		System.out.println("c1 Color: " + c1.getColor());
		System.out.println("c1 make: " + c1.getMake());
		System.out.println("c1 speed: " + c1.getSpeed());
		
		c1.brake();
		System.out.println("c1 speed: " + c1.getSpeed());
		
		
	}
}
