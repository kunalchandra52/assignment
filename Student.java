package com.ty.assignment;

import java.util.Comparator;

public class Student{
	int id;
	String name;
	int age;
	double marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student st=(Student)obj;
		return this.id==st.id;
	}
	public Student(int id, String name, int age, double marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}

