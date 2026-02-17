package com.rays.oop.exercise;

public class TestRichman {

	public static void main(String[] args) {
	
		RichMan person;
		
		person = new BusinessMan();
		person.donation();
		person.party();
		
		System.out.println("-----------------------");
		
		person = new Student();
		person.donation();
		person.party();
	}
}
