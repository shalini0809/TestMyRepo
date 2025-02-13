package com.cg.assignment;

public class Book {
	
 String title;
 String author;
 double price;
 int publicationYear;
 
 
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String title, String author, double price, int publicationYear) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	this.publicationYear = publicationYear;
}
 
    @Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publicationYear=" + publicationYear
			+ "]";
}
	public void getBookDetails() {
    	System.out.println();
    }
    
    public void setPrice(double newprice) {
    	
    	if(newprice>0) {
    		price=newprice;
    		System.out.println("Your new price is " + newprice);
    	}else {
    		System.out.println("You cannot set a negative price for book.");
    	}
    }
    
    public void displayBook() {
    	System.out.println("Title :"+this.title+" Author :"+this.author+" Price:"+this.price+" Publication Year:"+this.publicationYear);
    }
    
    public void setPublicationYear(int setyear) {
    	if((setyear>1500)&&(setyear<=2024)){
    		publicationYear=setyear;
    		System.out.println("Your new year is " + setyear);
    	}else {
    		System.out.println("You cannot set new year.");
    	}
    }
    
    public int ageOfBook() {
    	int age=2024-publicationYear;
    	return age;
		
    }
   
}
