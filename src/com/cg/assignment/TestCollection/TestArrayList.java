package com.cg.assignment.TestCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("hello");
		String s=(String) list.get(0);
		System.out.println(s);
		
		ArrayList<String> list1=new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("52");
        list1.add("two");
        list1.add(null);
        
//        using for each loop
        
//        for(Object o: list1) {
//        	System.out.println(o);
//        }
        
//        using string generic
        
//        for(String str:list1) {
//        	
//        	System.out.println(str);
//        }
        
//        using for loop
        
//        for(int i=0; i<3;i++) {
//        	System.out.println(list1.get(i));
//        }
//        
//        using iterator
        
//        Iterator<String> it=list1.iterator();
//        while(it.hasNext()) {
//        	System.out.println(it.next());
//        }
        
//        using iteratorlist
        
        ListIterator<String> it=list1.listIterator(list1.size());
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        while(it.hasPrevious()) {
        	System.out.println(it.previous());
        }
        	
        
        
        }     
}
