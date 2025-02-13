package com.cg.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class removeDuplicatesFromList {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(2);
		l1.add(38);
		l1.add(2);
		l1.add(6);
		l1.add(2);
		l1.add(6);
		l1.add(85);
		
		Map<Integer, Integer> m=new HashMap<>();
		for(Integer i:l1) {
			//m.put(i, m.getOrDefault(i, 0)+1);
			m.put(i, i);
		}
		
		for(Map.Entry<Integer, Integer> entry:m.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getValue());
				
			}
			
		}
		
		
		

	}

}
