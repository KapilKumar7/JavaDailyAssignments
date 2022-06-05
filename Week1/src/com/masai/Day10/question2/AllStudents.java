package question2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name of Science: ");
		String name = scanner.next();
		System.out.println("Enter student Adress of Science Student: ");
		String Address = scanner.next();
		System.out.println("Enter Physics marks ");
		int phisicsMarks = scanner.nextInt();
		System.out.println("Enter Chemestry marks ");
		int chemistryMarks = scanner.nextInt();
		System.out.println("Enter Maths marks ");
		int mathsMarks = scanner.nextInt();

		ScienceStudent s1 = new ScienceStudent(name, Address);
		s1.chemistryMarks = chemistryMarks;
		s1.mathsMarks = mathsMarks;
		s1.phisicsMarks = phisicsMarks;

		System.out.println("Enter student name of Arts Student: ");
		String name1 = scanner.next();
		System.out.println("Enter student Adress of Arts Student : ");
		String Address1 = scanner.next();
		System.out.println("Enter History marks ");
		int History = scanner.nextInt();
		System.out.println("Enter Civics marks ");
		int Civics = scanner.nextInt();

		HistoryStudent s2 = new HistoryStudent(name, Address);

		s2.historyMarks = History;
		s2.civicsMarks = Civics;

		System.out.println("===================================");
		System.out.println("Stream -Science");
		System.out.println("Name : " + s1.name);
		System.out.println("Address : " + s1.Address);

		System.out.println("Percentage is " + s1.getPercentage());
		System.out.println("===================================");
		System.out.println("Stream -Arts");
		System.out.println("Name : " + s2.name);
		System.out.println("Address : " + s2.Address);
		System.out.println("Percentage is " + s2.getPercentage());
	}

}
