package day4_Strings;

public class String_Palindrome {

	public static void main(String[] args) {
		/*
		 * Write a program to check whether a given string is a palindrome (reads the
		 * same forward and backward). Examples: "madam" → Palindrome
		 * 
		 * "racecar" → Palindrome
		 * 
		 * "hello" → Not a palindrome
		 */

		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}

}
