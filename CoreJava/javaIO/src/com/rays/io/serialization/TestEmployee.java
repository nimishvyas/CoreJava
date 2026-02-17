package com.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee(1, "Ram");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\IO\\Employee.xls"));
		
		out.writeObject(e);
		
		out.close();
		
		System.out.println("Object Serialized");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\IO\\Employee.xls"));
		
		System.out.println(in.readObject());
		
		in.close();
	}
}
