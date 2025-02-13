package com.cg.myDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {

	public static void main(String[] args) {

    LocalDate today=LocalDate.now();
    System.out.println("Today is : "+today);
		
    LocalDate myDate=LocalDate.of(2023, 02, 04);
    System.out.println("My date is :" +myDate);
	
	
	String st="2024-12-30";
	 System.out.println("My date is :" +LocalDate.parse(st));
	
	DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	String formatedDate=today.format(dft);
	System.out.println("Today's date is :"+formatedDate);
	LocalDate nextDays=today.plusDays(1);
	System.out.println(nextDays);
	LocalDate nextMonth=today.plusMonths(1);
	System.out.println(nextMonth);
	LocalDate nextYear=today.plusYears(2);
	System.out.println(nextYear);
	
	System.out.println(today.getDayOfWeek());
	System.out.println(today.getMonth());
	System.out.println(today.getYear());
}
}