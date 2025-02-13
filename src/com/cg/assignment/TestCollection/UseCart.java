package com.cg.assignment.TestCollection;

import java.util.Stack;

public class UseCart extends ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    Product p1=new Product("Shampoo", 388);
    Product p2=new Product("Soap", 947);
    Product p3=new Product("Scrub", 20);
    Product p4=new Product("Sunrise Coffee", 50);
    Stack<Product> pr=new Stack<>();
     
     pr.push(p1);
     pr.push(p2);
     pr.push(p3);
     ShoppingCart sc=new ShoppingCart(pr);
     
     showCart();
     addProduct(p4);
     showCart();
     removeProduct(p1);
     showCart();
     viewLastAddedProduct();
	}

}
