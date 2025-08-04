package java_basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * Taking Input Using Scanner:
		 * 
		 * Java uses Scanner class to read input from the console.
		 * 
		 * Steps to use Scanner: import java.util.Scanner;
		 * 
		 * Create object: Scanner sc = new Scanner(System.in);
		 * 
		 * Use methods:
		 * 
		 * nextInt() – read int
		 * 
		 * nextDouble() – read double
		 * 
		 * next() – read a single word
		 * 
		 * nextLine() – read full line
		 * 
		 * Close scanner: sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("Enter your age ");
		int age = sc.nextInt();

		System.out.println("Enter your salary ");
		double salary = sc.nextDouble();

		System.out.println("Hello, My name is " + name + ", age is " + age + " my salary is " + salary);
		exercise1(sc);
		exercise2(sc);
		exercise3(sc);
		exercise4(sc);
		sc.close();

	}

	/*
	 * Practice Exercises (Homework for Day 2) Do these on your own (type manually):
	 * 
	 * Exercise 1: Write a program that:
	 * 
	 * Takes 2 numbers from user.
	 * 
	 * Prints:
	 * 
	 * Sum
	 * 
	 * Difference
	 * 
	 * Product
	 * 
	 * Quotient
	 * 
	 * Remainder
	 * 
	 * Exercise 2: Write a program that:
	 * 
	 * Takes an integer from user.
	 * 
	 * Prints whether it’s even or odd using % operator.
	 * 
	 * Exercise 3: Write a program that:
	 * 
	 * Asks for name and age.
	 * 
	 * If age >= 18, print “Hello [name], you are eligible to vote.”
	 * 
	 * Else print “Sorry [name], you are not eligible.”
	 * 
	 * Exercise 4 (Challenge): Take 3 numbers from user and find the largest number
	 * using:
	 * 
	 * if-else statements
	 * 
	 * logical operators
	 * 
	 */
	public static void exercise1(Scanner sc) {

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("The sum of two numbers is " + sum);

		int diff = num1 - num2;
		System.out.println("The difference between two numbers is " + diff);

		int prod = num1 * num2;
		System.out.println("The product of two numbers is " + prod);

		if (num2 != 0) {
			int quot = num1 / num2;
			System.out.println("Quotient: " + quot);

			int rem = num1 % num2;
			System.out.println("Remainder: " + rem);
		} else {
			System.out.println("Division by zero is noint number = sc.nextInt();t allowed.");
		}

	}

	/*
	 * Exercise 2: Write a program that:
	 * 
	 * Takes an integer from user.
	 * 
	 * Prints whether it’s even or odd using % operator.
	 */
	public static void exercise2(Scanner sc) {
		System.out.println("Enter an integer: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}

	/*
	 * Exercise 3: Write a program that:
	 * 
	 * Asks for name and age.
	 * 
	 * If age >= 18, print “Hello [name], you are eligible to vote.”
	 * 
	 * Else print “Sorry [name], you are not eligible.”
	 */

	public static void exercise3(Scanner sc) {

		sc.nextLine();
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Hello " + name + ", You are eligible to vote");
		} else {
			System.out.println("Sorry " + name + ", You are not eligible");
		}

	}

	/*
	 * Exercise 4 (Challenge): Take 3 numbers from user and find the largest number
	 * using:
	 * 
	 * if-else statements
	 * 
	 * logical operators
	 */

	public static void exercise4(Scanner sc) {

		sc.nextLine();
		System.out.println("Enter three numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int largest;

		if (a >= b && a >= c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}
		System.out.println("The largest number is " + largest);

	}

}
