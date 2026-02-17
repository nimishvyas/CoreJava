package com.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccount {

	public static void main(String[] args) throws Exception{
		
		Account a = new Account("888777999000", 46789.0);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\IO\\Account.txt"));
		
		out.writeObject(a);
		out.close();
		
		System.out.println("Object Serialized");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:\\IO\\Account.txt"));
		
		System.out.println(in.readObject());
		
		in.close();
	}
}
