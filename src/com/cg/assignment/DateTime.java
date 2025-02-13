package com.cg.assignment;

public class DateTime {
//
//	
//	import java.time.LocalDate;
//	import java.time.format.DateTimeFormatter;
//	import java.time.format.DateTimeParseException;
//	import java.util.Scanner;
//
//	public class DayOfWeekCalculator {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.println("Enter a date (yyyy-MM-dd):");
//	        String dateInput = scanner.nextLine();
//	        
//	        try {
//	            // Parse the input date
//	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//	            LocalDate date = LocalDate.parse(dateInput, formatter);
//	            
//	            // Get the day of the week
//	            String dayOfWeek = date.getDayOfWeek().toString();
//	            
//	            // Output the day of the week
//	            System.out.println("The day of the week is: " + dayOfWeek);
//	        } catch (DateTimeParseException e) {
//	            System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd.");
//	        }
//	    }
//	}
	
	
	
//	import java.time.Duration;
//	import java.time.ZoneId;
//	import java.time.ZonedDateTime;
//	import java.util.Scanner;
//
//	public class TimeDifferenceCalculator {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        
//	        System.out.println("Enter the first city (e.g., Asia/Kolkata):");
//	        String city1 = scanner.nextLine();
//	        
//	        System.out.println("Enter the second city (e.g., Europe/London):");
//	        String city2 = scanner.nextLine();
//	        
//	        try {
//	            // Get the current time in the first city
//	            ZonedDateTime timeInCity1 = ZonedDateTime.now(ZoneId.of(city1));
//	            
//	            // Get the current time in the second city
//	            ZonedDateTime timeInCity2 = ZonedDateTime.now(ZoneId.of(city2));
//	            
//	            // Calculate the time difference
//	            Duration duration = Duration.between(timeInCity1, timeInCity2);
//	            long hoursDifference = duration.toHours();
//	            
//	            // Output the time difference
//	            System.out.println("The time difference between " + city1 + " and " + city2 + " is " + Math.abs(hoursDifference) + " hours.");
//	        } catch (Exception e) {
//	            System.out.println("Invalid city name or time zone. Please enter valid city names.");
//	        }
//	    }
//	}


	
	
	
}
