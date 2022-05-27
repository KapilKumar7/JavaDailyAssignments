package question1;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		e1.Name = "Alpha";
		e1.Age = 25;
		e1.Phone_number = 99912212;
		e1.Address = "Delhi";
		e1.Salary = 200000;
		e1.Specialisation = "Blockchain";
		e1.Department = "Smart contract";
		System.out.println(e1.Name);
		System.out.println(e1.Age);
		System.out.println(e1.Phone_number);
		System.out.println(e1.Address);
		System.out.println(e1.Salary);
		System.out.println(e1.Specialisation);
		m1.Name = "Bravo";
		m1.Age = 28;
		m1.Phone_number = 99912212;
		m1.Address = "Mumbai";
		m1.Salary = 500000;
		m1.Specialisation = "Blockchain";
		m1.Department = "Smart contract";
		System.out.println();
		System.out.println(m1.Name);
		System.out.println(m1.Age);
		System.out.println(m1.Phone_number);
		System.out.println(m1.Address);
		System.out.println(m1.Salary);
		System.out.println(m1.Specialisation);
		System.out.println(m1.Department);

	}

}
