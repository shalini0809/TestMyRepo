package com.cg.assignment;

class CarType extends VehicleAbst{
public CarType(double fuelEfficiency, double maxSpeed) {
	super(fuelEfficiency, maxSpeed);
	this.comfortScore=4;
}

@Override
void getAttributes() {
	System.out.println("the fuel efficiency of car is :" + fuelEfficiency+" and maximum speed is :"+maxSpeed);
	
}

@Override
void getType() {
	System.out.println("It is a car");
	
}
}
