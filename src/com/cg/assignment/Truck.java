package com.cg.assignment;

public class Truck extends Vehicle{
  private double payloadCapacity;
  private String engineType;
  
public Truck() {
	super();
	// TODO Auto-generated constructor stub
}
public Truck(String brand, String model, int year, double price, double payloadCapacity, String engineType) {
	super(brand, model, year, price);
	this.payloadCapacity = payloadCapacity;
	this.engineType = engineType;
}
@Override
public String toString() {
	return "Truck [payloadCapacity=" + payloadCapacity + ", engineType=" + engineType + "]";
}

public void carInfo() {
	System.out.println("This truck is a model "+this.getModel()+" from year "+this.getYear()+" by brand "+this.getBrand()+" the price of this truck is "+this.getPrice()+" it has payload capacity of "+payloadCapacity+" and is of engine type "+engineType);
}


  
  



  
  
  
}
