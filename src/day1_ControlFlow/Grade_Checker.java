package day1_ControlFlow;

import java.util.Scanner;

public class Grade_Checker {

	public static void main(String[] args) {
		
		//Nested if-else statements
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your grades (0 to 100): ");

		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("Grade A");
		} else if (grade >= 70) {
			System.out.println("Grade B");
		} else if (grade >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");
		}
		sc.close();

	}

}
