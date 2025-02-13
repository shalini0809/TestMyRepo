package com.cg.assignment;

public class CharacterFrequencyArray {

	public static void main(String[] args) {
		char[] charArray= {'a', 'b', 'a', 'c', 'b', 'a', 'd', 'c', 'd', 'd'};
        char[] characters = new char[charArray.length];
        int[] frequency=new int[charArray.length];
        int uniqueCount=0;
       
        for(int i=0; i<charArray.length; i++) {
        	char c=charArray[i];
        	boolean found=false;
        	for(int j=0; j<uniqueCount; j++) {
        		if(characters[j]==c) {
        			frequency[j]++;
        			found=true;
        		}
        	}
        	if(!found) {
        		characters[uniqueCount] = c;
                frequency[uniqueCount] = 1;
                uniqueCount++;
        	}
        }
        for(int i=0; i<uniqueCount; i++) {
        	 System.out.println("Character: " + characters[i] + ", Frequency: " + frequency[i]);
        }
        
        }
        
        
	}


