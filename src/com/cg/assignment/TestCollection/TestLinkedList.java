package com.cg.assignment.TestCollection;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> li=new LinkedList();
        li.add(2);
        li.add(7);
        li.add(8);
        li.add(10);
        li.add(37664);
        li.addFirst(0);
        li.addLast(10);
        
        for(Object show:li) {
        
//        System.out.println(li.getFirst());
//        System.out.println(li.get(1));
        
        System.out.println(li.remove(2));
        System.out.println(li.removeFirst());
        System.out.println(li.removeLastOccurrence(10));
        System.out.println(li);
        }
	}

}
