package com.cg.java8.functionalInterface;
@FunctionalInterface
public interface Bank {
	
public int getInterest();
//public void display();    dosn't allow more than one method


public default void display() {
	System.out.println("Say Hello");
}
}