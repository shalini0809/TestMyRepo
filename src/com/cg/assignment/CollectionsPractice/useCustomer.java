package com.cg.assignment.CollectionsPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class useCustomer {

	public static void main(String[] args) {
		
		TreeSet<Customer> c1=new TreeSet<>(new ByName());
        c1.add(new Customer("Neil", 18, 001, 300.53));
        c1.add(new Customer("Abhay", 25, 003, 6355.23));
        c1.add(new Customer("Rakesh", 35, 002, 73.91));
        c1.add(new Customer("Zain", 26, 004, 48.01));
        
        System.out.println("Before sorting by name :");
        for(Customer s1:c1) {
        	System.out.println(s1);
        }
       

        Collections.sort(c1, new ByName());
//        System.out.println("Movies sorted by rating:");
//        for (Customer s1:c1) {
//            System.out.println(s1.name);
//        }

       
	}

}
