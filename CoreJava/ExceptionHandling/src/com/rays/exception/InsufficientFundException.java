package com.rays.exception;

public class InsufficientFundException extends RuntimeException{

	public InsufficientFundException() {
		super("Insufficient funds for tranfer");
	}
}
