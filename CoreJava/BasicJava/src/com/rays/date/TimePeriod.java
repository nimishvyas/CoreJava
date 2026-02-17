package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {
	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today: " + todayDate);
		LocalDate birthDate = LocalDate.of(1998, 8, 30);
		System.out.println("dob: " + birthDate);
		Period period = Period.between(todayDate, birthDate);
		System.out.println(period.getYears()+ "Year" + period.getMonths()+ "Month" + period.getDays()+ "Day" );
		
	}
}
