package com.cg.assignment;

public class UseTestStatic {

	public static void main(String[] args) {
		
		TestStatic ts1=new TestStatic(101, "Neil", 84);
		TestStatic ts2=new TestStatic(102, "Nitin", 36);
		TestStatic ts3=new TestStatic(103, "Mukesh", 74);
       ts1.getTotalStudent();
       System.out.println(ts1);
       System.out.println(ts2);
       System.out.println(ts3);
       
       ts2.updateMarks(66);
       System.out.println(ts2);
	}

}
