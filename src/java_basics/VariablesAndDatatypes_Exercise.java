package java_basics;

public class VariablesAndDatatypes_Exercise {

	public static void main(String[] args) {
		/*
		 * Exercises Write a Java program to store your: Exercise-1 Name (String)
		 * 
		 * Age (int)
		 * 
		 * Salary (double)
		 * 
		 * QA status (boolean) And print them in one line
		 */
		String name = "Sumit";
		int age = 28;
		double salary = 50000.00;
		boolean qaStatus = true;
		System.out.println("My name is " + name + ", My age is " + age + ", My salary is " + salary
				+ ". am I a QA Engineer? " + qaStatus);

		/* Change the value of variables and print again. */
		name = "QA Sumit";
		age = 30;
		salary = 55000.00;
		qaStatus = false;
		System.out.println("My name is " + name + ", My age is " + age + ", My salary is " + salary
				+ ". am I a QA Engineer? " + qaStatus);

		/*
		 * Take two numbers and print: Sum Difference Product
		 */
		
		int num1 = 20;
		int num2 = 10;
		int sum = num1 + num2, diff = num1 - num2, product = num1 * num2;
		
		System.out.println("The sum of numbers is " + sum);
		System.out.println("The difference between the numbers is " + diff);
		System.out.println("The product of numbers is " + product);
	}

}
