package com.cg.assignment.CollectionsPractice;

import java.util.Comparator;

public class byTotalSpent implements Comparator<Customer>{



	@Override
	public int compare(Customer a, Customer b) {
		
		return Double.compare(a.totalSpent, b.totalSpent);
	}
}
