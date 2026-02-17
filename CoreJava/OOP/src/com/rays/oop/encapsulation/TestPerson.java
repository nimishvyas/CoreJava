package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p1 = new Person();

		p1.setName("Ghanshyam");
		p1.setDob(sdf.parse("1994- 05-28"));
		p1.setAddress("Indore");
		
		System.out.println("p1 name: " + p1.getName());
		System.out.println("p1 dob: " + p1.getDob());
		System.out.println("p1 address: " + p1.getAddress());
		System.out.println("p1 age: " + p1.getAge(p1.getDob()));

		System.out.println("------------------");

		Person p2 = new Person();

		p2.setName("Radheshyam");
		p2.setDob(sdf.parse("2009-08-19"));
		p2.setAddress("Ratlam");

		System.out.println("p2 name: " + p2.getName());
		System.out.println("p2 dob: " + p2.getDob());
		System.out.println("p2 address: " + p2.getAddress());
		System.out.println("p2 age: " + p2.getAge(p2.getDob()));

		
	}
}
