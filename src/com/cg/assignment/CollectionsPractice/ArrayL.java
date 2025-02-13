package com.cg.assignment.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayL{
	
	private List<Library> stock;
	public ArrayL() {
		stock=new ArrayList<>();
	}
	
	public void addNew(String bName, int checkouts) {
		stock.add(new Library(bName, checkouts));
	}
	public void removeBook(String bName) {
		stock.removeIf(Library->Library.bName.equalsIgnoreCase(bName));
	}
	
	public void sortBooks() {
		Collections.sort(stock, Comparator.comparing(Library->Library.bName));
	}
	public void display() {
		for(Library books:stock) {
			System.out.println(books);
		}
	}
}
