package day2_Loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// Take an integer from user and print its multiplication table from 1 to 10.
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		sc.close();
	}
}