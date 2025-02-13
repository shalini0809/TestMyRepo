package com.cg.assignment.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class TestComparable {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();

        // Adding student data to the LinkedList
       al.add(new Student("Alice","001", 38));
        al.add(new Student("Bob","003", 85));
        al.add(new Student("Charlie","008", 83));

        // Sorting the student list
        Collections.sort(al);

        // Printing the sorted student data
        System.out.println("Sorted Student List:");
        for (Student s : al) {
            System.out.println(s);
        }
    }
}
