package java_basics;

public class Operators_In_Java {

	public static void main(String[] args) {

		/*
		 * Arithmetic Operators: (+ Addition), (- Subtraction), (* Multiplication), (/
		 * Division), (% Remainder)
		 */

		int num1 = 10, num2 = 20;
		System.out.println("The addition of two numbers is " + (num1 + num2));
		System.out.println("The subtraction between two numbers is " + (num1 - num2));
		System.out.println("The multiplication of two numbers is " + (num1 * num2));
		System.out.println("The division of two numbers is " + (num2 / num1));
		System.out.println("The remainder of two numbers is " + (num1 % num2));

		/*
		 * Relational (Comparison) Operators: (== Equals , != Not equals, > Greater
		 * than, < Less than, >= Greater than equals to, <= Less than equals to )
		 */
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
	}

}
