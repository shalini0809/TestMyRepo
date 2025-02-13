package com.cg.assignment;

public class Car extends Vehicle {
 private int numDoors;
 private String fuelType;
 
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(String brand, String model, int year, double price, int numDoors, String fuelType) {
	super(brand, model, year, price);
	this.numDoors = numDoors;
	this.fuelType = fuelType;
}
@Override
public String toString() {
	return "Car [numDoors=" + numDoors + ", fuelType=" + fuelType + "]";
}

public void carInfo() {
	System.out.println("This car is a model "+this.getModel()+" from year "+this.getYear()+" by brand "+this.getBrand()+" the price of this car is "+this.getPrice()+" it has "+numDoors+" doors and is of "+fuelType+" fueltype.");
}
 
 
  
  
}
