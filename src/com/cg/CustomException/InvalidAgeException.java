package com.cg.CustomException;

import java.util.Scanner;

public class InvalidAgeException{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age :");
		int age=sc.nextInt();
		try {
		CheckAge(age);
		}catch(CheckCustomException e){
			System.out.println("Invalid age "+e.getMessage());
		}
		
	}
public static void CheckAge(int age) throws CheckCustomException {
	if(age<18||age>50) {
		throw new CheckCustomException("Age is not valid.");
	}
}
	
}
