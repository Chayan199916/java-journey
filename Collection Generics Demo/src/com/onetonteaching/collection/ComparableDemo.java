package com.onetonteaching.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setMarks(50);
		s1.setRoll(1);
		
		Student s2 = new Student();
		s2.setMarks(60);
		s2.setRoll(2);
		
		Student s3 = new Student();
		s3.setMarks(70);
		s3.setRoll(3);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
//		list.forEach(System.out :: println);
		
		Collections.sort(list); // no need to pass comparator
		
		list.forEach(System.out :: println);
		
	}


}

class Student implements Comparable<Student>{ // needed when dealing with custom class coz handling sorting should be implemented inside the entity.

	private int roll, marks;
	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return this.marks > s1.marks ? -1 : this.marks < s1.marks ? 1 : 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(roll) + ", " + Integer.toString(marks);
	}
	
}