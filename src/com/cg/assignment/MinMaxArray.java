package com.cg.assignment;

public class MinMaxArray {

	public static int minArray(int[] array) {
		int min=array[0];
		for(int i=0; i<array.length; i++) {
			
			if(array[i]<min) {
				min=array[i];
			}
		}
		
		return min;
		
	}
	
	public static int maxArray(int[] array) {
		int max=array[0];
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		return max;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {3,54,84,21,9,8};
		int min=minArray(arr);
		int max=maxArray(arr);
		
		System.out.println("Minimum of array is :"+min);
		System.out.println("Maximum of array is :"+max);
	}

}
