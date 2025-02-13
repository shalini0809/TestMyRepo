package com.cg.hashmapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryManage {
	  private List<Employee> employees;

	    public SalaryManage() {
	        employees = new ArrayList<>();
	    }

	    public void addEmployee(Employee employee) {
	        employees.add(employee);
	    }

	    public Map<String, Integer> calculateTotalSalaries() {
	        Map<String, Integer> totalSalaries = new HashMap<>();
	        for (Employee employee : employees) {
	            totalSalaries.put(employee.getDesignation(),
	                totalSalaries.getOrDefault(employee.getDesignation(), 0) + employee.getSalary());
	        }
	        return totalSalaries;
	    }

	    public double calculateAverageSalary() {
	        int totalSum = 0;
	        int count = 0;
	        for (Employee employee : employees) {
	            totalSum += employee.getSalary();
	            count++;
	        }
	        return (double) totalSum / count;
	    }

	    public List<Map.Entry<String, Integer>> getDesignationsAboveAverage() {
	        Map<String, Integer> totalSalaries = calculateTotalSalaries();
	        double averageSalary = calculateAverageSalary();

	        List<Map.Entry<String, Integer>> result = new ArrayList<>();
	        for (Map.Entry<String, Integer> entry : totalSalaries.entrySet()) {
	            if (entry.getValue() > averageSalary) {
	                result.add(entry);
	            }
	        }

	        result.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
	        return result;
	    }
}
