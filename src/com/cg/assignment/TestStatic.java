package com.cg.assignment;

public class TestStatic {
static int TotalStudent;
int id;
String name;
double marks;

static {
	System.out.println("School system initialized.");
}

public TestStatic(int id, String name, double marks) {
	this.id=id;
	this.name=name;
	this.marks=marks;
	TotalStudent++;
}
public TestStatic() {
	super();
}
public static void getTotalStudent() {
	System.out.println(TotalStudent);
}
public void updateMarks(double newMarks) {
	this.marks=newMarks;
	
}
@Override
public String toString() {
	return "TestStatic [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}



}
