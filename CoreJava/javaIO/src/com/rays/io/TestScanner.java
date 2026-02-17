package com.rays.io;

import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws Exception{
		
		FileReader r = new FileReader("c:\\IO\\FiltToSplit.txt");
		
		Scanner sc = new Scanner(r);
		
		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
	}
}
