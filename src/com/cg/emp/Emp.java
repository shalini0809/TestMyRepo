package com.cg.emp;

import java.util.Objects;

public class Emp {
	private int id;
	private String name;
    private  double salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
     public void Display(int id, String name, double salary) {
    	 System.out.println("Name of emp is :"+name);
    	 System.out.println("ID of emp is :"+id);
    	 System.out.println("salary of emp is :"+salary);
    	 
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
