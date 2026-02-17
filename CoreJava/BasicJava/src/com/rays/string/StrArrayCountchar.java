package com.rays.string;

public class StrArrayCountchar {
	public static void main(String[] args) {
		String[] str = {"vijay", "dinanath", "chouhan"};
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			for (char c = 'a'; c<='z'; c++) {
			for (int j=0; j< s.length(); j++) {
				if (s.charAt(j)==c) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(c + "=" + count);
				count= 0;
				}
			}	
		}
	}
}

