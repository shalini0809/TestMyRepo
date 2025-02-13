package com.cg.assignment;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		String str1="Hey";
		String str2="There";
		String str=str1.concat(str2);
		System.out.println(str);
		
		String temp=str1;
		str1=str2;
		str2=temp;
		System.out.println(str1+str2);

	}

}
