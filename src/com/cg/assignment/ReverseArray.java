package com.cg.assignment;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array= {4,33,6,73,38};
		
		int n=array.length;
		for(int i=0; i<n/2; i++) {
			int temp=array[i];
			array[i]=array[n-1-i];
			array[n-1-i]=temp;	
		}
			System.out.println("Reversed array:");
	        for (int i : array) {
	            System.out.print( i + " ");
		}

	}

}
