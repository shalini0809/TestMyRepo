package com.cg.assignment;

public class useVehicle {

	public static void main(String[] args) {
		
		VehicleAbst car1=new CarType(19.22, 150.0);
        VehicleAbst bike1=new Bike(62.08, 250.22);
        
        
        car1.getType();
        car1.getAttributes();
        car1.getComfortScore();
        bike1.getType();
        bike1.getAttributes();
        bike1.getComfortScore();
        
        
        
        
        
	}

}
