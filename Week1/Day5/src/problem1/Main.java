package problem1;

public class Main {

	public static void main(String[] args) {
	    Employee e2=Employee.getEmployeeDetails();
		int pf =Employee.getPFPercentage();
		e2.calculateNetSalary(pf);
		System.out.println(pf);
		System.out.println("Id: "+ e2.getEmployeeId());
		System.out.println("Name: "+ e2.getEmployeeName());
		System.out.println("Salary: "+ e2.getSalary());
		System.out.println("Net Salary: "+ e2.getNetSalary());
		


	}

}
