package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File file = new File("C:\\IO\\Hello.txt");

		if (file.exists()) {
			System.out.println("file name: " + file.getName());
			System.out.println("file path: " + file.getAbsolutePath());
			System.out.println("can read: " + file.canRead());
			System.out.println("can write: " + file.canWrite());
			System.out.println("is folder/directory: " + file.isDirectory());
			System.out.println("is file: " + file.isFile());

			Date d = new Date(file.lastModified());
			System.out.println(d);
			System.out.println(file.length());

		} else {
			System.out.println("file not found");
		}

	}

}
