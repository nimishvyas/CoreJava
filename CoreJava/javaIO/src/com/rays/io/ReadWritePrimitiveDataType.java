package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWritePrimitiveDataType {

	public static void main(String[] args) throws Exception {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:\\IO\\Primitive.txt"));
		
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.2);
		out.close();
		
		System.out.println("Data added");
		
		DataInputStream in = new DataInputStream(new FileInputStream("c:\\IO\\Primitive.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
	}
}
