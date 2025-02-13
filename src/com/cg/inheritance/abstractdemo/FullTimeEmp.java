package com.cg.inheritance.abstractdemo;

public class FullTimeEmp extends Employee {

	double salary;

	public FullTimeEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmp(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	 public void display() {
//		 System.out.println(this.id+this.name+this.salary);
	     System.out.println(this.salary);
	     super.display();
	 }
	 
	 

	@Override
	public String toString() {
		return "FullTimeEmp [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}

	@Override
	public void calculateSalary() {
		System.out.println(salary+(salary*0.7));
		System.out.println("printed");
	}
     
	}


