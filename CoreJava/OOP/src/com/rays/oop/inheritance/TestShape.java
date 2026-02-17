package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setBorderWidth(1);
		c.setColor("Blue");
		c.setRadius(2);
		
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Color: " + c.getColor()); 
		System.out.println("BorderWidth: " + c.getBorderWidth());
		c.area();
		
		
		
		Rectangle r= new Rectangle();
		r.setBorderWidth(1);
		r.setColor("Red");
		r.setLength(20);
		r.setWidth(13);
		
		System.out.println("Length: " + r.getLength());
		System.out.println("Color: " + r.getColor()); 
		System.out.println("BorderWidth: " + r.getBorderWidth());
		System.out.println("Width: " + r.getWidth());
		r.area();
	}
}
