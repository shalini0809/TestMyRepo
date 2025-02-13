package com.cg.assignment;
import java.util.Scanner;
public class MergeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the first array: ");
		int n1=sc.nextInt();
		System.out.print("Enter the number of elements in the second array: ");
		int n2=sc.nextInt();
		
		String[] arr1=new String[n1];
		String[] arr2=new String[n2];
		
	    System.out.println("Enter the elements of the first array:");
        for(int i=0; i<n1; i++) {
        	arr1[i]=sc.nextLine();
        }
        System.out.println("Enter the elements of the second array:");
        for(int i=0; i<n2; i++) {
        	arr2[i]=sc.nextLine();
        }
        
        String[] mergeArr=mergeArrays(arr1, arr2);
        
        System.out.println("Merged arrays: ");
        for(String element : mergeArr) {
        	 System.out.print(element + " ");
        }
	}	
        	public static String[] mergeArrays(String[] arr1, String[] arr2) {
        	int length1=arr1.length;
        	int length2=arr2.length;
        	String[] mergeArr=new String[length1+length2];
        	
        	for(int i=0; i<length1; i++) {
        		mergeArr[i]=arr1[i];
        		
        	}
        	for(int i=0; i<length2; i++) {
        		mergeArr[length1+i]=arr2[i];
        		
        	}
        	return mergeArr;
        	
        	
        }
        	
        	
	}


