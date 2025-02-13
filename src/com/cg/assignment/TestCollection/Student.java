package com.cg.assignment.TestCollection;
import java.util.LinkedList;

public class Student implements Comparable<Student> {
    String name;
  
    String id;
	double marks;

    

    public Student(String name, String id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	

    @Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}



	@Override
    public int compareTo(Student s1) {
        if(this.marks==s1.marks) {
        	return 0;// Sorting by name
        }else if(this.marks>s1.marks) {
        	return 1;
        }else {
        	return -1;
        }
    }
}
