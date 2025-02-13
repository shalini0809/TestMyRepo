package com.cg.assignment.CollectionsPractice;

import java.util.Comparator;

public class ByName implements Comparator<Customer>{


	@Override
	public int compare(Customer a, Customer b) {
		return a.name.compareTo(b.name);
	}
}
