package com.rays.exception;

public class MultipleException {

	public static void main(String[] args) {
		
		String name = null;
		
		try {System.out.println("Length of name: " + name.length());
			System.out.println("Character at 7th position: " + name.charAt(6));			
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("String abhi choti he!! " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Sundar sa nam nahi he! " + e.getMessage());
		}
		finally {
			System.out.println("Pandit hu me");
		}
	}
}
