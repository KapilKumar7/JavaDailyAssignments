package problem3;

import java.util.Scanner;

public class AccountDetails {
	public Account getAccountDetails() {
		Account a1 = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id: ");
		int accountId = sc.nextInt();
		a1.setAccountId(accountId);
		System.out.println("Enter account type: ");
		String accountType = sc.next();
		a1.setAccountType(accountType);

		System.out.println("Enter balance: ");
		int x = sc.nextInt();
		while (x <= 0) {
			System.out.println("Balance should be positive");
		}
		int balance = x;
		a1.setBalance(balance);
		return a1;
	}

	public int getWithdrawAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter amount to be withdrawn:");
		int x = sc.nextInt();
		while (x <= 0) {
			System.out.println("Amount should be positive");
		}
		int amount = x;
		return amount;

	}

	public static void main(String[] args) {
		AccountDetails ac1 = new AccountDetails();
		Account a = ac1.getAccountDetails();
		int amount = ac1.getWithdrawAmount();
		a.withdraw(amount);

	}

}
