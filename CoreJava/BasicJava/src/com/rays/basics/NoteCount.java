package com.rays.basics;

public class NoteCount {
	public static void main(String[] args) {
		int amount= 11220;
		int[] notes = {1000,500,200,100,50,20,10,5,2,1};
		System.out.println("Total amount: " + amount);
		int[] count = new int[notes.length];
		for (int i=0; i<notes.length; i++) {
			count[i]= amount/notes[i];
			amount= amount%notes[i];
			System.out.println(notes[i] + "=" + count[i]);
		}
	}
}
