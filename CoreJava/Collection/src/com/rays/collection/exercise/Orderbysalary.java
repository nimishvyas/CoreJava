package com.rays.collection.exercise;

import java.util.Comparator;

public class Orderbysalary implements Comparator<Employee>{

	@Override
	public int compare (Employee o1, Employee o2) {
		return o2.salary - o1.salary;
	}
	
}
