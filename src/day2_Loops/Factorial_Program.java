package day2_Loops;

import java.util.Scanner;

public class Factorial_Program {

	public static void main(String[] args) {
		// Read a number N and print its factorial (N!).

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//Read N

		long fact = 1;//Initialize fact=1
		for (int i = 1; i <= n; i++) {
			fact *= i;//Loop i=1 to N: multiply fact by i 
		}
		System.out.println(n + "! = " + fact); //Print fact
		sc.close();
	}

}
