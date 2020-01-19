package com.training.java;
import java.util.*;

public class CollectionTut {

	public static void main(String[] args) {

		List<Student> studs = new ArrayList<>();
		
		
		studs.add(new Student(1,84));
		studs.add(new Student(2,64));
		studs.add(new Student(3,59));
		studs.add(new Student(4,43));
		studs.add(new Student(5,24));
		studs.add(new Student(6,94));
		studs.add(new Student(7,86));
		
		Collections.sort(studs, (s1,s2) -> {
			
			return s1.marks < s2.marks ? 1:-1;
				
			
		});
		
		for(Student p : studs)
			System.out.println(p);
		
	}
	
	

	
}

 class Student
{
	
public int rollno;
public int marks;


public Student(int rollno, int marks) {
	super();
	this.rollno = rollno;
	this.marks = marks;
}


@Override
public String toString() {
	return "Student [rollno=" + rollno + ", marks=" + marks + "]";
}


	
}


