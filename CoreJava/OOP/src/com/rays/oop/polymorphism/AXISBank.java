package com.rays.oop.polymorphism;

public class AXISBank extends Bank {
	
	@Override
	public String getName() {
		return "AXISBank";
	}
	
	@Override
	public double interestRate() {
		return 11.25;
	}
}
