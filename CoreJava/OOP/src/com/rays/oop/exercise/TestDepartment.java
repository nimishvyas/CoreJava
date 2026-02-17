package com.rays.oop.exercise;

public class TestDepartment {

	public static void main(String[] args) throws CloneNotSupportedException {	
	
		Department d1 = new Department("IT");
		Department d2 = (Department) d1.clone();
		
		d2.employee = new Employee(2, "Shyam");
		d2.employee.localAddress= new Address("Bhopal");
		d2.employee.permAddress = new Address("Indore");
		
		System.out.println(d1);
		System.out.println(d2);
	}
}
