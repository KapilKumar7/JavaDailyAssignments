package problem1;

import java.util.Scanner;

public class Employee {
	

	private int employeeId;
	private  String employeeName;
	private double salary;
	private double netSalary;


	 public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

    
	 public void calculateNetSalary(int pfpercentage) {
		    this.netSalary=(100-pfpercentage)*salary;
	 }
	 
	 public static Employee getEmployeeDetails() {
		    Scanner scanner= new Scanner(System.in);
		    System.out.println("Enter id: ");
		      int employeeId=  scanner.nextInt();
		      System.out.println("Enter employeeName: ");
		        scanner.nextLine();
		      String employeeName =scanner.nextLine();
		      System.out.println("Enter salary: ");
		      double salary =scanner.nextInt();
		      
			Employee e1 =new Employee();
			e1.employeeId=employeeId;

			e1.employeeName=employeeName;

			e1.salary=salary;

			return e1;
 	 }
	 public static int getPFPercentage() {
		
		 Scanner scanner= new Scanner(System.in);
		  System.out.println("Enter PFPercentage: ");		 
		 int PFPercentage =scanner.nextInt();	
		 return PFPercentage;
		 
	 }
	

		

}
   

