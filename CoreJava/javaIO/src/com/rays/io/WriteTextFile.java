package com.rays.io;

import java.io.FileWriter;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {

		// FileWriter file = new FileWriter("D://IO//Sun.txt");
		FileWriter file = new FileWriter("C://IO//Rays.txt");

		file.write("Hello Rays");

		System.out.println("text data write successfully");

		file.close();

	}

}
