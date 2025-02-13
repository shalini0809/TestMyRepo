package com.cg.assignment;

import java.util.Scanner;

public class StringQues {

	public static void main(String[] args) {
	
		
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		StringBuilder sb=new StringBuilder(str);
	     String reverseS=sb.reverse().toString();
	     System.out.println(reverseS.equals(str));
	}	
}


