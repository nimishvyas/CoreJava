package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) throws ParseException {
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		System.out.println("Default format: " + d);
		String s = sdf.format(d);
		System.out.println("formatted Date: " + s);
		String dob = "1998-08-30";
		System.out.println("String Date: " + dob);
		Date date = sdf.parse(dob);
		System.out.println("FOrmatted date2: " + date);
	}
}
