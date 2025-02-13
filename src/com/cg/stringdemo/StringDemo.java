package com.cg.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
    System.out.println(s1.equals(s2));
    
    StringBuilder sb=new StringBuilder("Hiii ");
    sb.append(" there");
    sb.insert(7, " hello");
    System.out.println(sb);
//    sb.reverse();
    StringBuffer sbu=new StringBuffer("bye");
    System.out.println(sbu);
    sbu.append("now");
    sbu.insert(7, "okay");
    System.out.println(sbu);
//    sbu.reverse();
    
	}

}
