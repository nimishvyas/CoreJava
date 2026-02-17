package com.rays.basics;

public class PosOfIntArray {
	public static void main(String[] args) {
		int[] arr= { 18, 17, 16, 14, 14, 5, 6, 7, 8 };
		int temp= -1;
		int num= 18;
		for (int i = 0; i < arr.length; i++) {
			if (num== arr[i]) {
				temp=i;
				System.out.println(num + "="+ temp);
			}
		}
		System.out.println(temp == -1 ? temp:"");
	}
}
