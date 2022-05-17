package com.masai;

public class SwithStatement {
	static void citySpecification(String city) {
		switch (city) {
		case "Mumbai":
			System.out.println("Financial city");		
			break;
		case "Delhi":
			System.out.println("Capital of the country");		
			break;
		case "Kolkata":
			System.out.println("City of Joy");		
			break;
		case "Bangalore":
			System.out.println("Cyber City");		
			break;

		default:
			System.out.println("May be Other Indian City");
			
		}
			
		
	}

	public static void main(String[] args) {
    
	citySpecification("Delhi");
	

	}

}
