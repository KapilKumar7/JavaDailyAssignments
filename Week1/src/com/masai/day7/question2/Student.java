package question2;

public class Student {

	int studId = 101;
	String studName = "Kapil";
	double examFee = 2000;

	void displayDetails() {

	}

	double payFee() {
		return examFee;
	}

}

class DayScholar extends Student {

	double transportFee;

	double payFee() {

		return examFee + transportFee;

	}

}

class Hosteller extends Student {

	double hostelFee;

	double payFee() {

		return examFee + hostelFee;
	}

}
