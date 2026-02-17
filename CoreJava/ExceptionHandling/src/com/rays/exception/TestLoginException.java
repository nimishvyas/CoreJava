package com.rays.exception;

public class TestLoginException {

	public static void main(String[] args) {
		
		String login = "admin1";
		
		if (login == "admin") {
			System.out.println("User Found");
		} 
		else {
			
			try {
				throw new LoginException();
			} 
			catch (LoginException e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
	}
}
