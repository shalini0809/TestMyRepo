package com.cg.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringPractice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		String str2=sc.nextLine();
//		StringReverse(str);
//		System.out.println(checkPalindrome(str));
//		countVowelsConsonants(str);
//		System.out.println(firstNonRepeated(str));
//		checkAnagram(str, str2);
//		removeDuplicate(str);
sc.close();
	}
//
//  public static void StringReverse(String str) {
//	  String[] s=str.split(" ");
//	  StringBuilder sb=new StringBuilder();
//	  for(int i=s.length-1; i>=0; i--) {
//		  sb.append(s[i]);
//		  sb.append(" ");
//	  }
//	  System.out.println(sb);
//  }
  
//  public static boolean checkPalindrome(String str) {
//	  StringBuilder sb=new StringBuilder(str);
//	  return sb.reverse().toString().equals(str);
//  }
  
  
//   public static void countVowelsConsonants(String str) {
//	   int countVowels=0;
//	   int countCons=0;
//	   for(int i=0; i<str.length(); i++) {
//	   if("aeiou".indexOf(str.toLowerCase().charAt(i))!=-1){
//		   countVowels++;
//	   }else if(str.charAt(i)>'a'&&str.charAt(i)<'z')
//		   countCons++;
//   }
//	   System.out.println("Vowels :"+countVowels+" consonants:"+countCons);
//   }
	
	
//	public static Character firstNonRepeated(String str) {
//	   char[] ch=str.toCharArray();
//		Map<Character, Integer> map=new LinkedHashMap<>();
//		for(char i:ch) {
//			map.put(i, map.getOrDefault(i, 0)+1);
//		}
//		
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			if(entry.getValue()==1 && entry.getKey()!=' ') {
//			
//			return entry.getKey();
//		}
//		}
//		return 0;
//	}
	
//	public static void checkAnagram(String str, String str2) {
//		char[] ch1=str.toCharArray();
//		char[] ch2=str2.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		System.out.println(Arrays.equals(ch1, ch2));
//		
//	}
	
	
//	public static void removeDuplicate(String str) {
//		Set<Character> st=new LinkedHashSet<>();
//		for(int i=0; i<str.length(); i++) {
//			st.add(str.charAt(i));
//		}
//		String s=st.toString();           prints string in set format
//		System.out.println(s);
		
//		StringBuilder sb = new StringBuilder();
//
//		for (char c : st) {
//
//		sb.append(c);                         prints string normally
//
//		}
//		System.out.println(sb);
//	}
	
	
	
	
}
