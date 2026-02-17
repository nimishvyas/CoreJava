package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ValidEmails {

	public static void main(String[] args) throws Exception {
		
		FileReader r = new FileReader("c:\\IO\\Email.txt");
		
		FileWriter w = new FileWriter("c:\\IO\\VerifiedEmail.txt");
		
		BufferedReader br = new BufferedReader(r);
		String line = br.readLine();
		BufferedWriter bw = new BufferedWriter(w);
		
		while (line != null) {
			if (line.endsWith("gmail.com")) {
				bw.write(line);
				bw.newLine();
			} 
			line = br.readLine();
		}
		
		br.close();
		
		bw.close();
	}
}
