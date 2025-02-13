package com.cg.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {

	public static void main(String[] args) {
		
		List<String> str=new ArrayList<>();
		str.add("Neillllllllllllll");
		str.add("he is here");
		str.add("ys");
		str.add("");
		
		Collections.sort(str,new  Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				int lengthComparison=Integer.compare(s1.length(), s2.length());
				if(lengthComparison!=0) {
					return lengthComparison;
				}
				return s1.compareTo(s2);
			}
		
		});
		System.out.println(str);
		
	}

}
