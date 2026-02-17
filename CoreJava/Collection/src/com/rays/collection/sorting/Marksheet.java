package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String name;
	private int phy;
	
	public Marksheet(String name, String rollNo, int phy) {
		this.name = name;
		this.rollNo = rollNo;
		this.phy = phy;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		if (this.name.equals(o.name)) {
			return this.phy - o.phy;
		
		} else {
			return this.rollNo.compareTo(o.rollNo);
		}
	}
	
	@Override
	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;
	}
	
	
}
