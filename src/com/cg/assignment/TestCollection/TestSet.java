package com.cg.assignment.TestCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		Set<String> st= new HashSet<>();
		st.add("Hello hashset");
		st.add("I am new");
		st.add("You are new");
		for(String s:st) {
			System.out.println(s);
		}
		Set<String> tst=new TreeSet<>();
		tst.add("Hello treeset");
		tst.add("I am here");
		tst.add("shalini");
		for(String t:tst) {
			System.out.println(t);
		}
	

	}

}
