package com.rays.oop.exercise;

public class Circle extends Shape{

	private int radius;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int r) {
		this.radius = r;
	}
	
	@Override
	public void area() {
		System.out.println("Area of circle:" + Math.PI*radius*radius);
	}
}
