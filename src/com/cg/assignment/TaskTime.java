package com.cg.assignment;

import java.util.ArrayList;
import java.util.List;

public class TaskTime {

	public static void main(String[] args) {

    List<String> TaskList=new ArrayList<>();
    TaskList.add("0-begin-3");
    TaskList.add("1-end-35");
    TaskList.add("0-end-50");
    TaskList.add("1-begin-8");
    
    for(String letter:TaskList) {
    	letter.split("-");
    	String[] stringarray =letter.split("-");
    		
    			String third=stringarray[2];
    			for(int i=0; i<stringarray.length; i++) {
    				System.out.println(stringarray[i]);
//    				if(stringarray[1].equals("0")) {
    					
    				
    				}
    			}
    }
		
	}


