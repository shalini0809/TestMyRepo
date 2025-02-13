package com.cg.assignment.CustomException;
import java.util.Scanner;

public class BankAccount {
   String accountNumber;
   double balance;
   int amount;
   
   public void deposit(double balance, int amount) {
	   
	   balance=balance+amount;
	   System.out.println("Your new balance is  :"+balance);
   }
   
   public void withdraw(double balance, int amount)throws  BankInsufficientException{
	   if(balance>1000) {
			balance=balance-amount;
			System.out.println("Withdrawal successful. Your new balance is: " + balance);
		}else {
			throw new BankInsufficientException("Amount funds insufficient.");
		}
   }
	   
  public void checkAccount(String accountNumber) throws BankAccountException{
	  if(accountNumber.length()>8) {
		  throw new BankAccountException("Account no. is invalid");
	  }else {
		  System.out.println("Account number is valid.");
	  }
  }
  

public BankAccount() {
	super();
	
}
  
 
}
