package com.cg.assignment;

abstract class VehicleAbst {
double fuelEfficiency;
double maxSpeed;
int comfortScore;
public VehicleAbst(double fuelEfficiency, double maxSpeed) {
	this.fuelEfficiency=fuelEfficiency;
	this.maxSpeed=maxSpeed;
}

abstract void getAttributes();
void getComfortScore() {
	System.out.println("Your vehicle's comfort score is :" +comfortScore);
}
abstract void getType();
}
