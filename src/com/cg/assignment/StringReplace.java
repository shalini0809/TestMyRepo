package com.cg.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringReplace {

	public static void main(String[] args) {
		
		List<String> sourceStrings = Arrays.asList("aba");
		List<String> targetStrings = Arrays.asList("bbb");
		
		
		for(int i=0; i<sourceStrings.size(); i++) {
			String s=sourceStrings.get(i);
			String t=targetStrings.get(i);
			
			if(s.length()!=t.length()) {
				System.out.println("NO1");
			}
			

			Set<Character> st=new HashSet<>();
			Set<Character> tt=new HashSet<>();
			for(int j=0; j<s.length(); j++) {
			
			char sCh=s.charAt(j);
			char tCh=t.charAt(j);
			
           if(st.contains(sCh)&& !tt.contains(tCh)) {
        	   System.out.println("NO2");
			}else if(!st.contains(sCh) && tt.contains(tCh)) {
				System.out.println("NO3");
			}
				st.add(sCh);
                tt.add(tCh);
			 
		}
			System.out.println("YES");
		
	} 
	}
}
