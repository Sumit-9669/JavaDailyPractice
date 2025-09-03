package day4_Strings;

public class StringBasics {

	public static void main(String[] args) {
		/*
		 * A String in Java is a sequence of characters (like "Hello"). 
		 * Two ways to create strings: 1. String s1 = "Hello"; 2. String s2 = new String("Hello");
		 * Note: Strings are immutable → once created, they cannot be changed.
		 */
		
		// Creating string using literal (stored in string pool)
		String s1 = "Hello";
		
		// Creating string using new keyword (stored in heap memory)
		String s2 = new String("Hello");
		
		System.out.println("String using literal: " + s1);		
		System.out.println("String using new keyword: " + s2);
		
		//Strings are immutable
		String s3 = s1.concat(" World"); // Creates a new string object
		System.out.println("Original String: " + s1); // Still "Hello"
		System.out.println("After Concatenation: " + s3);// "Hello World"

	}

}
