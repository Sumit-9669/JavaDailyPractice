package day3_ControlFlow;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();

		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();

		System.out.println("Choose Operation (+, -, *, /): ");
		char op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.println("sum = " + (num1 + num2));
			break;

		case '-':
			System.out.println("Difference = " + (num1 - num2));
			break;

		case '*':
			System.out.println("Product = " + (num1 * num2));
			break;

		case '/':
			System.out.println("Division " + (num2 / num1));
			break;

		default:
			System.out.println("Invalid Operator");
		}
		sc.close();

	}

}
