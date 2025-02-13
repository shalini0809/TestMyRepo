package com.cg.assignment.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EatBurger {

	public static void main(String[] args) {
		
		Map<String, Burger> burgerMap=new HashMap<>();
		burgerMap.put("Burger1", new Burger(5.2f, 001, 350.0f, "Mexican"));
		burgerMap.put("Burger2", new Burger(6.8f, 002, 266.4f, "Paneer"));
		burgerMap.put("Burger3", new Burger(5.2f, 004, 882.4f, "Cheese"));
		burgerMap.put("Burger4", new Burger(6.8f, 006, 600.0f, "Spicy"));
		
		List<Burger> burgerList=new ArrayList<>(burgerMap.values());
 		Collections.sort(burgerList);
// 		for(Burger b:burgerList) {
// 			System.out.println(b);
// 		}
 		

		Map<String, Burger> burgerTreeMap=new TreeMap<>();
		burgerTreeMap.put("Burger3", new Burger(5.2f, 001, 350.0f, "Mexican"));
		burgerTreeMap.put("Burger2", new Burger(6.8f, 002, 966.4f, "Paneer"));
		burgerTreeMap.put("Burger7", new Burger(5.2f, 004, 882.4f, "Cheese"));
		burgerTreeMap.put("Burger4", new Burger(6.8f, 006, 600.0f, "Spicy"));
		
		
 		for(Burger b:burgerList) {
 			System.out.println(b);
 		}
 		
 		for(Map.Entry<String, Burger> entry:burgerTreeMap.entrySet()) {
        	System.out.println("Name: "+entry.getKey()+" Score :"+entry.getValue());
        }
        
	}

}
