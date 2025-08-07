package java_basics;

import java.util.Scanner;

public class Conditional_Statements_1 {

	public static void main(String[] args) {
		
		
		// if-else statements

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
		sc.close();

	}

}
