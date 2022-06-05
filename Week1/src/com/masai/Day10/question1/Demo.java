package question1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if (amount >= 1000) {
			Hotel h1 = new TajHotel();
			TajHotel t1 = (TajHotel) h1;
			t1.welcomeDrink();
			t1.chickenBiryani();
			t1.masalaDosa();

			return h1;
		} else if (amount > 200 && amount < 1000) {
			Hotel r1 = new RoadSideHotel();
			r1.chickenBiryani();
			r1.masalaDosa();
			return r1;
		} else {
			System.out.println("Please Enter valid amount;");
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter amount: ");

		Demo d1 = new Demo();
		d1.provideFood(scanner.nextInt());

	}

}
