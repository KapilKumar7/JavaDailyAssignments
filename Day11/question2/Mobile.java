package question2;

import java.util.Scanner;

public class Mobile {

	String[] outdatedModels = { "note4", "note5", "note6", "note7" };

	void searchOutdatedModel(String nameOfCompany, int... modelNumber) {

		for (int i = 0; i < outdatedModels.length; i++) {
			if (outdatedModels[i].equals(nameOfCompany)) {

				System.out.println(outdatedModels[i] + "_OUTDATED ");
				return;
			}

		}

		System.out.println("Model not found");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Model name: ");
		String nameOfCompany = scanner.next();
		System.out.println("Enter Model number: ");
		int modelNumber = scanner.nextInt();
		Mobile m1 = new Mobile();

		m1.searchOutdatedModel(nameOfCompany, 23);

	}

}
