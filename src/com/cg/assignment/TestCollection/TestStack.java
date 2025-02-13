package com.cg.assignment.TestCollection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
	
		Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.peek());
        
        
        PriorityQueue<Integer> qe=new PriorityQueue<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        System.out.println(qe.poll());
        System.out.println(qe.poll());
	}

}
