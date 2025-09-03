package day4_Strings;

public class String_Comparison {

	public static void main(String[] args) {
		/* Write a program to compare two strings in Java.
		   
		   We will check:

			If two strings are the same using ==

			If two strings are equal using .equals()

			Case-insensitive comparison using .equalsIgnoreCase()*/
		String s1 = "Sumit";
		String s2 = "Sumit";
		String s3 = new String("Sumit");
		
		String s4 = "sumit"; //Different case
		
		// Using == (reference comparison)
		System.out.println("s1 == s2 : " + (s1 == s2)); // true (same pool memory)
		System.out.println("s1 == s3 : " + (s1 == s3)); // false (different objects)
		
		// Using .equals() (content comparison)
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); //true
		System.out.println("s1.equals(s3) : " + s1.equals(s3)); //true
		System.out.println("s1.equals(s4) : " + s1.equals(s4)); //false
		
		// Using .equalsIgnoreCase()
		System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4)); //true
		
	}

}
