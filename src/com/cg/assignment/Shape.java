package com.cg.assignment;

public abstract class Shape {


	public Shape() {
	super();
}
	
	public void draw() {
		System.out.println("Drawing the shape.");
	}
	
	public void displayInfo() {
		
	}

	public abstract void area();
}
