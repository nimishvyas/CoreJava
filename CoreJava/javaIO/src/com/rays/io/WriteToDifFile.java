package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteToDifFile {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader( new FileReader("c:\\IO\\FiltToSplit.txt"));
		int count = 1;
		
		String line;
		
		while ((line= br.readLine())!= null) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\IO\\Split" + count + ".txt"));
			bw.write(line);
			bw.close();
			count++;
		}
		br.close();
	}
}
