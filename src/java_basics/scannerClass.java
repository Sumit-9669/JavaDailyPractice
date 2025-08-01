package java_basics;

import java.util.Scanner;

public class scannerClass {

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
		
		System.out.println("Hello, My name is " + name + ", age is " + age + "my salary is " + salary);
		
		sc.close();
		
		
	}

}
