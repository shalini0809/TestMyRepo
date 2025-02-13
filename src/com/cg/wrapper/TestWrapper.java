package com.cg.wrapper;

public class TestWrapper {

	public static void main(String[] args) {
		
		int x=10;
		Integer integerObj=x;   //autoboxing
		Integer integerObj1=x; 
		System.out.println(integerObj);
		System.out.println(integerObj.equals(integerObj1));
        
		int y=integerObj;       //unboxing
		System.out.println(integerObj); 
		
		String st="35";
		int z=Integer.parseInt(st);
		
		char ch='h';
		Character chObject=ch;
		System.out.println(ch);
		
	}

}
