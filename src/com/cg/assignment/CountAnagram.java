package com.cg.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountAnagram {

	public static void main(String[] args) {
		 
		String[] sList= {"Cat", "aCt","rUN", "uRn", "tac", "abc"};
		char[] cList= {};
		Map<String, Integer> aMap=new HashMap<>();
		for(int i=0; i<sList.length; i++) {
			cList=sList[i].toLowerCase().toCharArray();
			Arrays.sort(cList);
			String storeList=new String(cList);
			aMap.put(storeList, aMap.getOrDefault(storeList, 0)+1);
		}
		
		System.out.println(aMap);
		

	}

}
