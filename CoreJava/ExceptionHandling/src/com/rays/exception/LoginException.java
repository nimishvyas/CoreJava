package com.rays.exception;

public class LoginException extends Exception {

	public LoginException () {
		super("User Not Found");
	}
}
