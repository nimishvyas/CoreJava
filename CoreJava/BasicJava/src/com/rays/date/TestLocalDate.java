package com.rays.date;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("today's date: " + now);
		System.out.println("Day: " + now.getDayOfWeek());
		System.out.println("Date: "+ now.getDayOfMonth());
		System.out.println("month: " + now.getMonth());
		System.out.println("Year: " + now.getYear());
		System.out.println("day of year: " + now.getDayOfYear());
	}
}
