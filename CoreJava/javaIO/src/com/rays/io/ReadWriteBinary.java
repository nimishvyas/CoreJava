package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinary {

	public static void main(String[] args) throws Exception {
		
		String source = "c:\\Users\\nimis\\Downloads\\SamuraiVSDragon.mp4";
		
		String target = "c:\\Users\\nimis\\Downloads\\SamuraiVSDragon-copy.mp4";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int i = in.read();
		
		while (i!= -1) {
			System.out.println(i);
			out.write(i);
			i = in.read();
		}
		
		in.close();
		out.close();
		System.out.println("success");
		
		
	}
}
