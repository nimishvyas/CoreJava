package com.rays.exception;

public class Account {

	private double balance;
	
	public double getBalance;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw (double amt){
		if ( amt > this.balance ) {
			throw new InsufficientFundException();
		} else {
			this.balance = this.balance - amt;
			System.out.println("New Balance: " + this.balance);
		}
	}

	public double getBalance() {
		return balance;
	}
}
