package com.masai;

public class Student {
	
	int roll;
	String name;
	int marks;
	void displayStudentDetails () {
		System.out.println("Roll is : "+ roll);
		System.out.println("Name is : "+ name);
		System.out.println("Marks is : "+ marks);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.roll=20;
		s1.name="Krishna";
		s1.marks=90;
		s1.displayStudentDetails();
		
		
		s2.roll=1;
		s2.name="Buddha";
		s2.marks=99;
		s2.displayStudentDetails();
		
		s1=null;
		s2=null;
//		s1.displayStudentDetails();
//		s2.displayStudentDetails();
		
		
		

	}

}
