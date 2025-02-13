package com.cg.assignment.CollectionsPractice;

public class Customer {

	String name;
	int age;
	int id;
	double totalSpent;
	
	public Customer(String name, int age,int id,  double totalSpent  ) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.totalSpent=totalSpent;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", totalSpent=" + totalSpent + "]";
	}
	
	
	
	
	
	
	
}
