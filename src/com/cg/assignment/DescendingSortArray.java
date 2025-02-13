package com.cg.assignment;
import java.util.Scanner;

public class DescendingSortArray {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        int[] array = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	       
	  
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n-1-i; j++) {
	                if (array[j] < array[j+1]) {
	                   
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted array in descending order:");
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	    }
}

