package com.cg.assignment;

public class UseBook {

	public static void main(String[] args) {
		
		Book b1=new Book("Harry Potter", "JK Rowling", 500.0, 1957 );
        
        b1.setPrice(1000);
        
        b1.displayBook();
        b1.setPublicationYear(2020);
        int a=b1.ageOfBook();
        System.out.println("age of book is :" +a);
        System.out.println(b1);
	}
	

}
