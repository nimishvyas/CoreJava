package com.rays.oop.exercise;

public class Address implements Cloneable{

	public String address;
	
	public Address(String address) {
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		}
	
	@Override 
	public String toString() {
		return address;
	}
	
}
