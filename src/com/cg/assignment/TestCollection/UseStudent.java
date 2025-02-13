package com.cg.assignment.TestCollection;

import java.util.LinkedList;
import java.util.Scanner;

public class UseStudent extends Student {

	public UseStudent(int id, String name, double marks) {
		super(id, name, marks);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		LinkedList<Student> li=new LinkedList<>();
		int choice;
		do {
			System.out.println("Enter your choice :");
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("4. Search");
			System.out.println("5. Exit");
			Scanner sc=new Scanner(System.in);
			 choice = sc.nextInt();
	         sc.nextLine();
		 switch(choice) {
		 case 1:
			li.addStudent(01, "Neil", 75);
			 break;
			 
		 case 2:
			 removeStudent(01);
			 break;
		 case 3:
			 displayStudent();
			 break;
		 case 4:
			 searchStudent(01);
			 break; 
		 case 5:
			 System.out.println("exiting..");
			 break;
		}
		
		
		

		}while(choice!=5);

}
}
