package com.cg.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFreqInList {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(23);
		l1.add(3);
		l1.add(28);
		l1.add(02);
		l1.add(3);
		l1.add(23);
		
		Map<Integer, Integer> m=new HashMap<>();
        for(Integer i:l1) {
        	m.put(i, m.getOrDefault(i, 0)+1);
        	
        }
        for(Map.Entry<Integer, Integer> entry:m.entrySet()) {
        	System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        	
        }
	}

}
