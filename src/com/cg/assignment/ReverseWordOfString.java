package com.cg.assignment;

public class ReverseWordOfString {

	public static void main(String[] args) {
		
		String str="This is my house";
		String[] words=str.split(" ");
		String reverseString="";
		for(int i=0; i<words.length; i++) {
			String oneWord=words[i];
			String reverseWord="";
			for(int j=oneWord.length()-1; j>=0;j--) {
				reverseWord=reverseWord+oneWord.charAt(j);
				
			}reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(str);
        System.out.println(reverseString);
	}

}
