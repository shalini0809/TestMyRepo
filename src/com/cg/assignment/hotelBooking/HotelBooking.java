package com.cg.assignment.hotelBooking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelBooking {
   int roomNumber;
   String availableDates;
   String checkInDate;
   String checkOutDate;
   
public HotelBooking(int roomNumber, String availableDates) {
	super();
	this.roomNumber = roomNumber;
	this.availableDates = availableDates;
}

public void bookRoom(String checkInDate, String checkOutDate) throws IllegalArgException {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	try 
	{
		LocalDate checkIn=LocalDate.parse(checkInDate, formatter);
		LocalDate checkOut=LocalDate.parse(checkOutDate, formatter);
		if(checkOut.isAfter(checkIn)) {
			throw new IllegalArgException("Check out date must be after check in date.");
			System.out.println("Room booked from " + checkInDate + " to " + checkOutDate);
		}
	
	}
		

	}
   	
	}  

