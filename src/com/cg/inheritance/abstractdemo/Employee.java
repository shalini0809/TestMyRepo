package com.cg.inheritance.abstractdemo;

public abstract class Employee {
 int id;
 String name;
 static int number=100;
 static String company="Capgemini";
 
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(String name) {
	super();
	this.name = name;
	this.id=number++;
}
public static void show() {
	System.out.println("Hello !");
}

public abstract void calculateSalary();

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
 public void display() {
	 System.out.println(this.id+this.name);
 }
}
