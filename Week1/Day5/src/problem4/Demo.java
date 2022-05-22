package problem4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Enter total number of Student:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for (int i = 1; i <= n; i++) {
			Student si = new Student();
			System.out.println("Enter roll of " + i + " student");
			int roll = sc.nextInt();
			si.setRoll(roll);
			System.out.println("Enter Name of " + i + " student");
			String name = sc.next();
			si.setName(name);
			;
			System.out.println("Enter address of " + i + " student");
			sc.nextLine();
			String address = sc.nextLine();
			si.setAddress(address);
			System.out.println("Enter marks of " + i + " student");
			int marks = sc.nextInt();
			si.setMarks(marks);
			students[i - 1] = si;

		}
		int totalmarks = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Details of student " + (i + 1));
			System.out.println(students[i].getName());
			System.out.println(students[i].getRoll());
			System.out.println(students[i].getAddress());
			System.out.println(students[i].getMarks());
			System.out.println("-----------------------------");
			totalmarks = totalmarks + students[i].getMarks();
		}
		System.out.println("Average of all the Student marks: " + (totalmarks / n));

	}

}
