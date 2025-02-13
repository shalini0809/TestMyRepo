package com.cg.assignment;
import java.util.Scanner;
public class CheckAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age :");
		int age=sc.nextInt();
		try {
			CheckAge(age);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Runtime exception "+e.getMessage());
		}
	}
       public static void CheckAge(int age){
    	   if(age<18) {
    		   throw new ArithmeticException("Age is less than 18.");
    	   }else if(age>50){
    		   throw new RuntimeException("Age is greater than 50.");
    	   }
       }
	
}
