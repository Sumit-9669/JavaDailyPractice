package day2_Loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// Read N from user and find the sum of numbers from 1 to N.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;			
		}
		System.out.println("Sum of numbers 1..." + n + " = " + sum);
		sc.close();

	}

}
