package com.cg.assignment;

public class EnumTest {

	double salary;
	
	public EnumTest(double salary) {
		this.salary=salary;
	}
	
public enum EmpType{
	FullTime, PartTime, Contract;
}
public void checkType() {
	if(salary<=150000) {
		System.out.println("The employee type is :"+EmpType.FullTime);
	}else if(salary<=300000) {
		System.out.println("The employee type is :"+EmpType.PartTime);
	}
	else {
		System.out.println("The employee type is :"+EmpType.Contract);
	}
	
}
	
	public static void main(String[] args) {
		
EnumTest e1=new EnumTest(120000);
e1.checkType();
EnumTest e2=new EnumTest(200000);
e2.checkType();
EnumTest e3=new EnumTest(350000);
e3.checkType();
	}

}
