package com.cg.assignment.TestCollection;

public class Product {

		String name;
		double price;
		public Product(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}
		
		
	}


