package com.rays.oop.exercise;

public class BusinessMan implements RichMan {

	@Override 
	public void donation() {
		System.out.println("Gives DOnation");
	}
	
	@Override
	public void party() {
		System.out.println("Likes to party");
	}
}
