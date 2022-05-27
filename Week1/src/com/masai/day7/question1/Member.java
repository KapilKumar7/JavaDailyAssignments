package question1;

public class Member {

	String Name;
	int Age;
	int Phone_number;
	String Address;
	double Salary;

	void printSalary() {
		System.out.println(Salary);
	}

}

class Employee extends Member {
	String Specialisation;
	String Department;

}

class Manager extends Member {
	String Specialisation;
	String Department;

}
