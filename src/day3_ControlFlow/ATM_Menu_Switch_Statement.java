package day3_ControlFlow;

import java.util.Scanner;

public class ATM_Menu_Switch_Statement {

	public static void main(String[] args) {
		/*
		 * Create a menu:
		 * 
		 * 1. Check Balance 2. Deposit 3. Withdraw 4. Exit Use a fixed balance (e.g.,
		 * 1000).
		 * 
		 * Perform deposit/withdraw by user input.
		 */

		Scanner sc = new Scanner(System.in);

		double balance = 1000; // fixed starting balance

		System.out.println("===== ATM Menu =====");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Your current balance is: ₹" + balance);
			break;

		case 2:
			System.out.print("Enter deposit amount: ₹");
			double deposit = sc.nextDouble();
			if (deposit > 0) {
				balance += deposit;
				System.out.println("₹" + deposit + " deposited successfully!");
				System.out.println("Updated balance: ₹" + balance);
			} else {
				System.out.println("Invalid deposit amount!");
			}
			break;

		case 3:
			System.out.print("Enter withdrawal amount: ₹");
			double withdraw = sc.nextDouble();
			if (withdraw > 0 && withdraw <= balance) {
				balance -= withdraw;
				System.out.println("₹" + withdraw + " withdrawn successfully!");
				System.out.println("Updated balance: ₹" + balance);
			} else if (withdraw > balance) {
				System.out.println("Insufficient balance!");
			} else {
				System.out.println("Invalid withdrawal amount!");
			}
			break;

		case 4:
			System.out.println("Thank you for using the ATM. Goodbye!");
			break;

		default:
			System.out.println("Invalid choice!");
			break;
		}

		sc.close();
	}

}
