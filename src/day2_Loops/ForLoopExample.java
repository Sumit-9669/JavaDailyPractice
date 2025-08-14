package day2_Loops;

public class ForLoopExample {

	/*
	 * Write a Java program to print numbers from 1 to 10 using a for loop. for loop
	 * is ideal when the number of iterations is known in advance.
	 * 
	 * Syntax: for(initialization; condition; increment/decrement) { ... }
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Number: " + i);
		}
		System.out.println();

		/*
		 * Write a Java program to print even numbers between 0 to 20 using a for loop
		 */

		for (int i = 2; i <= 20; i += 2) {
			System.out.println("The even numbers between 0 to 20 are: " + i);
		}
		System.out.println();

		/* Write a Java program to print the sum of the first 10 natural numbers */
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);
	}
}
