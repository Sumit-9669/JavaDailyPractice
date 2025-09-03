package day4_Strings;

public class String_Length {

	public static void main(String[] args) {
		// Write a program to find the length of a string and print each character one by one.
		
		String str = "Sumit";
		System.out.println("The length of a given string is " + str.length());
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println("Character at index " + i + " = " + str.charAt(i));
		}
	}

}
