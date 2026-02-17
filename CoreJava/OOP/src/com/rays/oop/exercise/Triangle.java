package com.rays.oop.exercise;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base= base;
	}
	
	public int getHeigth() {
		return height;
	}
	
	public void setHeight() {
		this.height = height;
	}
	
	@Override
	
	public void area() {
		System.out.println("Area of Triangle:" + (base*height)/2);
	}
}
