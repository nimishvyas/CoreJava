package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(500.00);
		
		System.out.println("Current Balance: " + a.getBalance());
		
		a.withdraw(1000);
		
	}
}
