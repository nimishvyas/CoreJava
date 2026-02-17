package com.rays.collection.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Q2TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Rahul", 10000);
		Employee e2 = new Employee (2, "Rohit", 4000);
		Employee e3 = new Employee(3, "Uday", 8000);
		Employee e4 = new Employee(4, "Mohit", 25000);
		Employee e5 = new Employee(5, "Anirudh", 11000);
		
		
		ArrayList<Employee> list = new ArrayList();
		list.add(e1);
		list.add(e5);
		list.add(e4);
		list.add(e2);
		list.add(e3);
		
		Orderbysalary bySalary = new Orderbysalary();
		Collections.sort(list, bySalary);
		list.forEach(System.out::println);
		
		System.out.println("--------------------");
		
		OrderByName byName = new OrderByName();
		Collections.sort(list, byName);
		list.forEach(System.out::println);
		
	}
}
