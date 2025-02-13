package com.cg.emp;

public class UseEmployee {

	public static void main(String[] args) {
	
//    Emp empobj=new Emp(101, "Alex", 5000);
//    empobj.getId();
//    empobj.getSalary();
//    empobj.getName();
//    System.out.println(empobj);
////    empobj.id=1;
////    System.out.println(empobj.id);
//    System.out.println(empobj);
//    Emp empobj1=new Emp(102, "Shalini", 3999);
//    System.out.println(empobj1);
		
		
		Emp emp1=new Emp(001, "Nitin", 2000);
		Emp emp2=new Emp(001, "Nitin", 2000);
		Emp emp3=new Emp(371, "Satyam", 3540);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1==emp3);
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.hashCode());
		System.out.println(emp3.hashCode());
	
	}
}
