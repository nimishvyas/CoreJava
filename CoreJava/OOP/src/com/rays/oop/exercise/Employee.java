package com.rays.oop.exercise;

public class Employee implements Cloneable {

	public int id;
	public String name;
	public Address permAddress;
	public Address localAddress;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		this.permAddress = new Address("Indore");
		this.localAddress = new Address("Joara Compound");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.permAddress = (Address) this.permAddress.clone();
		e.localAddress = (Address) this.localAddress.clone();
		return e;
	}
	
	@Override
	public String toString() {
		return " Id: " + id + " Name: " + name + " Permanent Address: " + permAddress + " Local Address: " + localAddress ;
	}
	
}
