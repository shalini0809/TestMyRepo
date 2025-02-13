package com.cg.assignment.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> resultMap=new HashMap<>();
		resultMap.put("NEIL", 68);
		resultMap.put("NITIN", 85);
		resultMap.put("MUKESH", 96);
		resultMap.put("ISHANI", 48);
		resultMap.put("SUNDARI", 73);
		Set<String> keys=resultMap.keySet();
        for(String show:keys) {                                     
        	System.out.println(show+"-"+resultMap.get(show));
        }
        
        if(resultMap.containsKey("ISHANI")) {
        	System.out.println("Key found :"+resultMap.get("ISHANI"));
        }
        
//        get entry set
        for(Map.Entry<String, Integer> entry:resultMap.entrySet()) {
        	System.out.println("Name: "+entry.getKey()+" Score :"+entry.getValue());
        }
        
        //treeMap
        
        TreeMap<String, Integer> showMap=new TreeMap<>();
        showMap.put("Neha", 68);
		showMap.put("Yash", 85);
		showMap.put("Sundar", 96);
		showMap.put("Janvi", 48);
		showMap.put("Satyam", 73);
        Set<String> key=showMap.keySet();
        for(Map.Entry<String, Integer> entry:showMap.entrySet()) {
        	System.out.println("Name: "+entry.getKey()+" Score :"+entry.getValue());
        }
        
        
        
        
        
	}

}
