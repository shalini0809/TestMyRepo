package com.cg.assignment.CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class useArrayL {

	public static void main(String[] args) {
		
		ArrayL al=new ArrayL();
		al.addNew("The Great Gatsby", 30);
		al.addNew("1984", 45);
		al.addNew("To Kill a Mockingbird", 50);
		System.out.println("All books :");
        al.display();
       
        al.removeBook("1984");
        System.out.println("After removing :");
        al.display();
       
        al.sortBooks();
        System.out.println("After sorting :");
        al.display();
		
		
		
	}

}
