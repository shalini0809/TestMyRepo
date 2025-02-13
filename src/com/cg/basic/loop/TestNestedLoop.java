package com.cg.basic.loop;

public class TestNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     
//      for(int i=1; i<=5;i++) {
//    	  for(int j=1; j<=i; j++) {
//    		  System.out.print(i);
//  
//    	  }
//    	  System.out.println();
//      }
		
		for(int i=1; i<21;i++) {
			int count=0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count=1;}
					
				}
			if(count==0) {
			System.out.println(i);
			}
		}
		
		
		
	}

}
