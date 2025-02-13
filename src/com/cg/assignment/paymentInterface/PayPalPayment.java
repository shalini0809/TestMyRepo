package com.cg.assignment.paymentInterface;

public class PayPalPayment {
  String email;
  String transactionId;
  
  public PayPalPayment(String email, String transactionId) {
	  this.email=email;
	  this.transactionId=transactionId;
  }
  public void processPayment(double amount) {
      System.out.println("Processing PayPal payment of $" + amount);
  }

  public String getPaymentDetails() {
      return "PayPal [Email: " + email + ", Transaction ID: " + transactionId + "]";
  }
}
  
  
  

