package com.cg.assignment.TestCollection;

import java.util.Stack;

public class ShoppingCart {
	
private static Stack<Product> cart;

public ShoppingCart(Stack<Product> cart) {
	super();
	this.cart = cart;
}

public ShoppingCart() {
	super();
	// TODO Auto-generated constructor stub
}

public static void addProduct(Product product) {
	cart.push(product);
	System.out.println("Product has been added.");
}
public static void removeProduct(Product product) {
	if(!cart.isEmpty()) {
	cart.remove(0);
	System.out.println("Product has been removed.");
	}else {
		System.out.println("Cart is empty.");
	}
}
public static void viewLastAddedProduct() {
	if(!cart.isEmpty()) {
		cart.peek();
		System.out.println("the last product in cart."+cart.peek());
	}else {
		System.out.println("Cart is empty.");
	}
	
}

public static void showCart() {
	if(!cart.isEmpty()) {
		for(Product pr:cart) {
		System.out.println(pr);
		}
}
	
}
}