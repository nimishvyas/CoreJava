package com.rays.string;

public class StrsameReverse {
	public static void main(String[] args){
		String str = "Nimish Bharat Vyas";
		String[] str3= str.split(" ");
		for (int i =str3.length-1; i>=0; i--) {
			String s= str3[i];
			for (int j = s.length()-1; j>=0; j--) {
				System.out.print(s.charAt(j));
			}
			}
	}
}
