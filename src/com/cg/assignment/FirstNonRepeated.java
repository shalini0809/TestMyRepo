package com.cg.assignment;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String str="riyraay";
        
	   char result=findCharacter(str);
	   if(result!=0) {
		   System.out.println("Character is :"+result);
	   }else {
		   System.out.println("Character are repeated or string empty");
	   }
				
	}

	public static char findCharacter(String str) {
		int[] frequency=new int[256];
		for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
		for(int i=0;i<str.length();i++) {
			if(frequency[str.charAt(i)]==1) {
				return str.charAt(i);
			}
		}
		return 0;
	}

}
