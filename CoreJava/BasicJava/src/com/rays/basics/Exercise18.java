package com.rays.basics;

public class Exercise18 {
	public static void main(String[] args) {
		int[] arrayA= {8,6,5,4};
		int a= 10;
		int b= -1;
		for (int i=0; i< arrayA.length; i++) {
			if (arrayA[i]==a) {
				b= i;
				System.out.println("The position of number is " + b);
			}
		}
		System.out.println(b==-1 ? b:"");
		
	}

}
