package com.cg.hashmapPractice;

public class Employee {
	private String designation;
    private int salary;

    public Employee(String designation, int salary) {
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }
}
