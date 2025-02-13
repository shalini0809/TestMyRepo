package com.cg.assignment.CustomException;

import java.util.Scanner;

import com.cg.CustomException.CheckCustomException;
 
public class BankException {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no. :");
	String accountNumber=sc.nextLine();
	System.out.println("Enter balance :");
	double balance=sc.nextInt();
	System.out.println("Enter amount :");
	int amount=sc.nextInt();
	
	
	BankAccount b1=new BankAccount();
		try {
		b1.checkAccount(accountNumber);
		b1.deposit(balance, amount);
		b1.withdraw(balance, amount);
		}catch(BankAccountException e){
			System.out.println("Invalid Account number "+e.getMessage());
		}
		catch(BankInsufficientException e){
			System.out.println("Insufficient balance"+e.getMessage());
		}
		

	}

	
}
