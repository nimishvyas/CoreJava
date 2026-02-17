package com.rays.basics;

import java.util.Random;

public class RandomInteger {
	public static void main(String[] args) {
		Random random= new Random();
		for(int i= 1; i<=5; i++) {
			int randomNumber= random.nextInt(100);
			System.out.println("Number " + i + ": " + randomNumber);
		}
		}
	}

