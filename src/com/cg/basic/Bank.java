package com.cg.basic;

public class Bank {
	 //long a;
	String b;
	 double c;
	 static int account=1000;
	 int acc;
	

	public Bank(String b) {
		super();
		this.b=b;
		this.acc=account++;
	}
	
	public void display() {
		System.out.println(this.b+this.acc);
	}
	


	public Bank(String b, double c, int acc) {
		super();
		this.b = b;
		this.c = c;
		this.acc = acc;
	}

	@Override
	public String toString() {
		return "Bank [ b=" + b + ", c=" + c + "]";
	}






	public String getB() {
		return b;
	}




	public void setB(String b) {
		this.b = b;
	}




	public double getC() {
		return c;
	}




	public void setC(double c) {
		this.c = c;
	}
	
	public void deposit(int amount) {
		if(amount>100) {
			c=c+amount;
			System.out.println("Your new balance is :" +c);
		}
		else {
			System.out.println("Amount should be more than 100.");
		}
	}
	public void transact(int amount) {
		if(c>1000) {
			c=c-amount;
		}else {
			System.out.println("Not enough balance in account.");
		}
	
	}




	
}
