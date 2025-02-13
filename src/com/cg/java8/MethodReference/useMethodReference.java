package com.cg.java8.MethodReference;

public class useMethodReference {
	
	
	public useMethodReference() {
		super();
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		System.out.println(myInterestRate());
		Bank b1=useMethodReference::myInterestRate;      //giving reference to go to class and send it to bankInterface.
		System.out.println(b1.getInterest());
 Company c=useMethodReference::new;                     // using reference using constructor
 c.welcome();
 
 showInterface si=new useMethodReference()::display;      //using reference using another interface method
si.print();
	}
	
	

	public static int myInterestRate() {
		return 10;
	}

public void display() {

	System.out.println("Hey there");
}
}
