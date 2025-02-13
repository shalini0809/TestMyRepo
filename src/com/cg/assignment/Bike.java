package com.cg.assignment;

public class Bike extends VehicleAbst{
public Bike(double fuelEfficiency, double maxSpeed) {
	super(fuelEfficiency, maxSpeed);
	this.comfortScore=7;
}

@Override
void getAttributes() {
	System.out.println("The fuel efficiency of this bike is " + fuelEfficiency + " and a maximum speed of " + maxSpeed );
}
	


@Override
void getType() {
	System.out.println("It is a Bike.");
}
	
}


