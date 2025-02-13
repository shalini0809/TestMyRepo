package com.cg.assignment.testException;

public class ShoppingCart {
	
     String itemId;
     double price;
     int itemCount;
    double totalPrice;
    
	public ShoppingCart() {
		totalPrice=0.0;
		itemCount=0;
		
	}
	
	public void addItem(String itemID, double price)throws InvalidItemIDException, NegativePriceException {
	if(itemId==null || itemId.isEmpty()) {
		throw new InvalidItemIDException("Invalid item Id"+ itemId);
	}if(price<0) {
		throw new NegativePriceException("Negative price ");
	}
		totalPrice+=price;
		itemCount++;
	}

	public double getTotalPrice() throws EmptyCartException{
		
		if(itemCount==0) {
			throw new EmptyCartException("The cart is empty.");
		}
		return totalPrice;
	}
	
	 

}