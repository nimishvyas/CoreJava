package com.rays.basics;

public class SortArray {
	public static void main(String[] args) {
		int[] arr= {78,55,67,34,98};
		for (int i=0; i<arr.length-1; i++) {
			for (int j= 0; j<arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int b= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= b;
				}
			}
		}
		for (int k :arr) {
			System.out.println(k);
		}
	}
}
