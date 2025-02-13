package com.cg.assignment;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str="This is my house";
		String[] words=str.split(" ");
		String result="";
		for(int i=0; i<words.length; i++) {
			 String oneWord=words[i];
			  result=result+oneWord;
		} 
				
		System.out.println(str);
        System.out.println(result);
	}
	

}
