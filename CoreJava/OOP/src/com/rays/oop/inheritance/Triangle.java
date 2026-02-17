package com.rays.oop.inheritance;

public class Triangle extends Shape {
	
	private int base;
	
	private int height;
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public void area() {
		System.out.println("Area of Triangle: " + (base*height/2));
	}
}
