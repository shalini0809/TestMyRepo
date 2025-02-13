package com.cg.java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class useAddable {

	public static void main(String[] args) {
		
		List<String> nameList=new ArrayList<>();
		nameList.add("hey ");
		nameList.add("there ");
		nameList.add("nice ");
		nameList.add("meeting ");
		nameList.add("you");
		
		for(String x:nameList) {
			System.out.print(x);
		}
		
		nameList.forEach((x)->{System.out.println(x);});      //lambda function(shorter)
		
		Addable ad1=new Addable()
				{

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		}; 
		
		System.out.println(ad1.add(10,20));
		
		ad1 = (x, y) -> x + y;
		

	}

}
