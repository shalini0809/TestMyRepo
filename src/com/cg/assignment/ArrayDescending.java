package com.cg.assignment;

public class ArrayDescending {

	public static void main(String[] args) {
		int[] numbers= {23,74,7,8,18,3,01};
		sortArray(numbers);
		for (int num : numbers) {
            System.out.print(num + " ");
        }

	}
	
	public static void sortArray(int[] array) {
		 for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] < array[j]) {
	                    // Swap elements
	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
		 }
}
}