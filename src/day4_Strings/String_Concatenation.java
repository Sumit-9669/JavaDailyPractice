package day4_Strings;

public class String_Concatenation {

	public static void main(String[] args) {
		/* Write a program to join two or more strings together using:
			1. + operator
			2. .concat() method */
		String firstName = "Sumit";
		String lastName = "Pande";
		
		//Concatenate using '+' operator
		String fullName1 = firstName + " " + lastName;
		System.out.println("Using + operator: " + fullName1);
		
		//Concatenate using concat() method
		String fullName2 = firstName.concat(" ").concat(lastName);
		System.out.println("Using concat() method: " + fullName2);
		
		//Concatenate multiple strings
		System.out.println("Hello, " + firstName + " " + lastName + "!");
	}

}
