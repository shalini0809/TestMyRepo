package com.cg.assignment.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

import com.cg.assignment.TestCollection.Student;

public class TestComparator {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(02, "kashish", 47));
		al.add(new Student(02, "kashish", 47));
		al.add(new Student(02, "kashish", 47));
		Collections.sort(al,new MarksComparator());
		for(Student s:al) {
			System.out.println(s);
		}
	}

}
