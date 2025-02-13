package com.cg.assignment;

public class Vehicle {
   
	private String brand;
	private String model;
	private int year;
	private double price;
	
	
	public Vehicle() {
		super();
		
	}


	public Vehicle(String brand, String model, int year, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	 public void setPrice(double newprice) {
	    	
	    	if(newprice>0) {
	    		price=newprice;
	    		System.out.println("Your new price is " + newprice);
	    	}else {
	    		System.out.println("You cannot set a negative price for vehicle.");
	    	}
	    }


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}
	 

	
}
