package com.cg.hashmapPractice;

import java.util.List;
import java.util.Map;

public class useSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SalaryManage manager = new SalaryManage();

	        // Adding sample employees
	        manager.addEmployee(new Employee("Manager", 80000));
	        manager.addEmployee(new Employee("Manager", 90000));
	        manager.addEmployee(new Employee("Manager", 85000));
	        manager.addEmployee(new Employee("Developer", 60000));
	        manager.addEmployee(new Employee("Developer", 65000));
	        manager.addEmployee(new Employee("Developer", 70000));
	        manager.addEmployee(new Employee("Analyst", 50000));
	        manager.addEmployee(new Employee("Analyst", 55000));
	        manager.addEmployee(new Employee("Analyst", 52000));

	        // Get designations with total salary above average
	        List<Map.Entry<String, Integer>> result = manager.getDesignationsAboveAverage();

	        // Print the result
	        for (Map.Entry<String, Integer> entry : result) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	}

}
