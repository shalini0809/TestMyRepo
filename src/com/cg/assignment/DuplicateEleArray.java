package com.cg.assignment;

public class DuplicateEleArray {

	public static void main(String[] args) {
		  int[] array = {11,2,45,2,4,77,11};

	        System.out.println("Duplicate elements in the array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    System.out.println(array[i]);
	                    break; // To avoid printing the same duplicate multiple times
	                }
	            }
	        }

	}

}
