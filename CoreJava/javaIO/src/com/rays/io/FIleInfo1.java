package com.rays.io;

import java.io.File;

public class FIleInfo1 {

	public static void main(String[] args) {
		
		File file = new File("C:\\IO\\Hello.txt");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		
	}
	
}
