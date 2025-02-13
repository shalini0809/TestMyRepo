package com.cg.assignment.testException;

public class EcomCheckout {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		
		try {
			cart.addItem("item3", -47.00);

		}catch(NegativePriceException e){
			System.out.println(e.getMessage());
		} catch (InvalidItemIDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 cart.addItem("item1", 29.99);
			 cart.addItem("item2", 49.99);
			 cart.addItem("", 19.99);

		}catch(InvalidItemIDException e){
			System.out.println(e.getMessage());
		} catch (NegativePriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			double totalPrice=cart.getTotalPrice();
			System.out.println("Total price : $"+totalPrice);
			
		}catch(EmptyCartException e) {
			System.out.println(e.getMessage());
		}

	}

}
