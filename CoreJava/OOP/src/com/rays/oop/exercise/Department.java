package com.rays.oop.exercise;

public class Department implements Cloneable{

	public String deptName;
	public Employee employee ;
	
	public Department(String deptName) {
		this.deptName = deptName;
		this.employee = new Employee(1, "Ram");
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		Department d = (Department) super.clone();
		d.employee = (Employee) employee.clone();
		return d;
	}
	
	@Override
	public String toString() {
		return " Department Name: " + deptName + " Employee: " + employee;
	}
}
