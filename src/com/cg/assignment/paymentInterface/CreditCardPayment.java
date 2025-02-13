package com.cg.assignment.paymentInterface;

public class CreditCardPayment implements PaymentMethod {
   private String cardNo;
   private String expiryDate;
   
public CreditCardPayment(String cardNo, String expiryDate) {
	super();
	this.cardNo = cardNo;
	this.expiryDate = expiryDate;
}
/*
public void processPayment(double amount) {
	System.out.println("Processing credit card payment of $" + amount);

}*/

public String getPaymentDetails() {
	return  "Credit Card [Number: " + cardNo + ", Expiry Date: " + expiryDate + "]";
}


@Override
public void prcoessPayment(double amount) {
	// TODO Auto-generated method stub
	System.out.println("Processing credit card payment of $" + amount);
	
}


}
   

