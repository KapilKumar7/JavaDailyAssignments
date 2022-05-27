package question4;

import java.util.Scanner;

class Bank {

	String branchName;
	String IfscCode;

	void displayDetails() {
		System.out.println(branchName);
		System.out.println(IfscCode);

	}

}

class AxisBank extends Bank {

	double rateOfInterest;

	void displayDetails() {
		System.out.println(branchName);
		System.out.println(IfscCode);
		System.out.println(rateOfInterest);

	}

	void getCreditCard() {

		System.out.println("cardNumber=1234566;");
		System.out.println("cvv =234;");

	}
}

class ICICIBank extends Bank {

	double rateOfInterest;

	void displayDetails() {
		System.out.println(branchName);
		System.out.println(IfscCode);
		System.out.println(rateOfInterest);

	}

}

public class Demo {
	public static Bank getBank(String bank) {

		if (bank.equals("axis")) {
//			System.out.println("axis");
			AxisBank axisBank = new AxisBank();
			axisBank.rateOfInterest = 7;
			axisBank.branchName = bank;
			axisBank.IfscCode = "03444242";

			return axisBank;
		} else if (bank.equals("icici")) {
			ICICIBank iciciBank = new ICICIBank();
			iciciBank.rateOfInterest = 4;
			iciciBank.branchName = bank;
			iciciBank.IfscCode = "03444242";

			return iciciBank;

		} else {
			System.out.println("Enter a valid Bank");
			return null;
		}
//
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bank Name");
//		String bank = scanner.next();
//		System.out.println(bank);
		String bank = scanner.next();

		if (bank.equals("axis")) {
			getBank(bank).displayDetails();
			AxisBank b1 = (AxisBank) getBank(bank);

			b1.getCreditCard();
		} else {
			getBank(bank).displayDetails();
		}

	}

}
