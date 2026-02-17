package com.rays.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account("54598452340", "saving", 500000.00);
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getaccountType());
		System.out.println(a1.getbalance());
	}
}
