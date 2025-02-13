package com.cg.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeSortedList {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		
		l1.add(2);
		l1.add(38);
		l1.add(19);
		l1.add(6);
		l2.add(85);
		l2.add(56);
		l2.add(100);
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		List<Integer> mergedL=new ArrayList<>(l1);
		mergedL.addAll(l2);
		Collections.sort(mergedL);
		
		for(Integer j:mergedL) {
			System.out.println(j);
		}

	}

}
