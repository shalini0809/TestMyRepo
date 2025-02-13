package com.cg.assignment;

public class findDuplicateElementArray {

	public static void main(String[] args) {
		
				
				int[] numbers = {3, 5, 7, 2, 8, -1, 4, 5, 12};
		        findDuplicateElement(numbers);

			}

			public static void findDuplicateElement(int[] array) {
				
				 for (int i = 0; i < array.length; i++) {
			            for (int j = i + 1; j < array.length; j++) {
			                if (array[i] == array[j]) {
			                    System.out.print(array[i] + " ");
			                    break; 
			                }
		

	
			            }
}
			}
}
