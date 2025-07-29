package java_basics;

public class Printing_Statement {

	public static void main(String[] args) {

		// Printing simple text using println (adds a new line after printing)
		System.out.println("This is the syntax used for printing a statement in java");

		// Printing without a new line using print()
		System.out.print("This will be printed ");
		System.out.print("on the same line. \n");

		// Printing numbers (Integers do not have the double quote)
		System.out.println(100);
		System.out.println(777);

		// Printing text + numbers together
		System.out.println("The sum of 10 and 20 is " + (10 + 20));

		// Escape characters
		System.out.println("To print double quotes we use \\\" like this: \"Hello\"");

		// Formatting output
		System.out.printf("My name is %s and I am %d years old.\n", "Sumit", 25);

	}

}
