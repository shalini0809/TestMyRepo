package com.cg.testHashmap;

import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, String> hashtable=new Hashtable<>();
		hashtable.put(null, null);
		hashtable.put(null, null);
		hashtable.put("City", "Indore");
		
		System.out.println(hashtable.get("Age"));
		System.out.println(hashtable.get("City"));
		
		display(hashtable);
		
		if(hashtable.containsKey("City")) {
			System.out.print(hashtable.get("City"));
		}
	}
	
	public static void display(Hashtable<String, String> table) {
		for(String key:table.keySet()) {
			System.out.println(table.get(key));
		}
	}
	
	public static void remove(Hashtable<String, String> table) {
		
	}
}
