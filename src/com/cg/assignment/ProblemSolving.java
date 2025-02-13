package com.cg.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProblemSolving {

	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();
		arr.add(4);
		arr.add(3);
		arr.add(9);
		arr.add(1);
		arr.add(6);
		int k=2;
		Collections.sort(arr);
//		Collections.sort(arr, Collections.reverseOrder());
//	  System.out.println(arr.get(0));           //descending order nd max
//		
//	  Collections.reverse(arr);                 //reverse of array
//	  System.out.println(arr);
	  
//	  Collections.rotate(arr, k);               //rotate by k
//	  System.out.println(arr);
		
//		Map<Integer, Integer> map=new HashMap<>();           //frequency of elements
//		for(int i=0; i<arr.size(); i++) {
//			map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);
//		}
//		System.out.println(map);
		
		
//		List<Integer> l2=new ArrayList<>();
//		l2.add(9);
//		l2.add(7);
//		l2.add(0);                                    //merge two sorted array
//		Collections.sort(arr);
//		Collections.sort(l2);
//		arr.addAll(l2);
//		Collections.sort(arr);
//		System.out.println(arr);
		
		

//		List<Integer> l2=new ArrayList<>(arr);
//		Collections.sort(l2);
//		List<Integer> l3=new ArrayList<>(arr);                           //check sorted
//		Collections.sort(l3, Collections.reverseOrder());
//	    if(arr.equals(l2)||arr.equals(l3)){
//	    	System.out.println("True");
//	    }
//	    else {
//	    	System.out.println("False");
//	    }
		
//		List<Integer> l2=new ArrayList<>();
//		l2=Arrays.asList(2, 3, 4, 2, 4, 4, 2, 4, 4);
//		int n=l2.size();
//		boolean check=false;
//		
//		Map<Integer, Integer> map=new LinkedHashMap<>();
//		for(int i=0; i<l2.size(); i++) {
//			map.put(l2.get(i), map.getOrDefault(l2.get(i), 0)+1);
//		}
//			for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//			if(entry.getValue()>n/2) {
//				System.out.println(entry.getKey());
//				check=true;
//				break;
//			}
//			}
//			if(!check) {
//				System.out.println(check);
//			}
			
//			List<Integer> lcs=new ArrayList<>();
//			lcs=Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
//			if(lcs.isEmpty()) {
//				return;
//			}
//			int globalMax=lcs.get(0);
//			int currMax=lcs.get(0);
//			int s=0; int temp=0; int e=0;
//			for(int i=1; i<lcs.size();i++) {
//				currMax=Math.max(lcs.get(i), lcs.get(i)+currMax);
//				if(lcs.get(i)>lcs.get(i)+currMax) {
//					currMax=lcs.get(i);
//					temp=i;
//				}
//				else {
//					currMax=lcs.get(i)+currMax;
//				}
//				if(currMax>globalMax) {
//					globalMax=currMax;
//					s=temp;
//					e=i;
//				}
//			}
//			System.out.println(globalMax);
//			System.out.println(lcs.subList(s, e+1));
		
		
//		String str="aab";
//		StringBuilder sb=new StringBuilder();
//		int count=1;
//		for(int i=0; i<str.length()-1; i++){
//			
//			if(str.charAt(i)==str.charAt(i+1)) {
//				count++;
//			}else {
//				sb.append(str.charAt(i));                         //compress string
//				sb.append(count);
//				count=1;
//			}
//		}
//		sb.append(str.charAt(str.length()-1));
//		sb.append(count);
//		System.out.println(sb);
		
		String str="Hello";
		
		
		
		}
	}
	
	



