package com.cg.assignment;

public class LargestElementArray {

	public static void main(String[] args) {
		 int[] array = {10, 20, 5, 30, 25};

	        // Assume the first element is the largest initially
	        int largest = array[0];

	        // Iterate through the array to find the largest element
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > largest) {
	                largest = array[i];
	            }
	        }

	        // Print the largest element
	        System.out.println("The largest element in the array is: " + largest);
	    }

	}


