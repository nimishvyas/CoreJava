package com.rays.basics;

public class AvgofOddEven {
	public static void main(String[] args) {
		int n = 6;
		int sumOdd = 0;
		int sumEven = 0;
		int countOdd = 0;
		int countEven= 0;
		for(int i = 1;i<=n; i++){
		if (i % 2 != 0) {
			sumOdd = sumOdd + i;
			countOdd++;
		} else {
			sumEven = sumEven + i;
			countEven++;
		}
		}
		int avgOdd = sumOdd / countOdd;
		int avgEven = sumEven/ countEven;
		System.out.println("Avg of Odd numbers is "+avgOdd);System.out.println("Avg of Even numbers is "+avgEven);
}
}