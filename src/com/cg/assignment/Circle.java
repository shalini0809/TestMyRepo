package com.cg.assignment;

public class Circle extends Shape {

	int radius;
	
	public Circle(int radius) {
		super();
		this.radius=radius;
	}
	@Override
public void area(){
	int a=(int) (3.14*(radius*radius));
	System.out.println("Area of circle :"+a);
}

	
	
}
