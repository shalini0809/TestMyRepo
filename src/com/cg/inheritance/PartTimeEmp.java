package com.cg.inheritance;

public class PartTimeEmp extends Employee {
	
   double commission;

public PartTimeEmp() {
	super();
	// TODO Auto-generated constructor stub
}

public PartTimeEmp(int id, String name, double commission) {
	super(id, name);
	// TODO Auto-generated constructor stub
	this.commission=commission;
}
public void display() {
	System.out.println(this.id+this.name+this.commission);
}

@Override
public String toString() {
	return "PartTimeEmp [commission=" + commission + ", id=" + id + ", name=" + name + "]";
}
   
}
