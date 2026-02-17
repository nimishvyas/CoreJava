package com.rays.oop.encapsulation;

public class Account {
	
	private String number= null;
	private String accountType= null;
	private double balance= 0;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String num) {
		this.number = num;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String type) {
		this.accountType = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double bal) {
		this.balance = bal;
	}
	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("Total balance after deposit: " + balance);
	}
	public void withdrawal (double amt) {
		if (amt > balance) {
			System.out.println("Insufficient Funds");
		} else {
			balance = balance - amt;
			System.out.println("Total balance after withdrawal: " + balance);
		}
	}
}
