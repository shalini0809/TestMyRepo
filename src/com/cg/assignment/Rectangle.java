package com.cg.assignment;

public class Rectangle extends Shape {
private int height;
private int width;
public Rectangle(int height, int width) {
	super();
	this.height = height;
	this.width = width;
}
public Rectangle() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public void area() {
	int a=height*width;
	System.out.println("Area of rectangle :"+a);
}



}
