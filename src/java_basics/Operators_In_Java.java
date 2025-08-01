package java_basics;

public class Operators_In_Java {

	int num1 = 10, num2 = 20;

	public static void main(String[] args) {

		Operators_In_Java obj = new Operators_In_Java();

		obj.arithmeticOperators();
		obj.relationalOperators();
		obj.logicalOperators();
		obj.assignmentOperators();
		obj.incrementDecrementOperator(); 
		obj.ternaryOperator();
		 
	}

	public void arithmeticOperators() {

		/*
		 * Arithmetic Operators: (+ Addition), (- Subtraction), (* Multiplication), (/
		 * Division), (% Remainder)
		 */

		System.out.println("\n========== Arithmetic Operators in Java ==========");
		System.out.println("The addition of two numbers is " + (num1 + num2));
		System.out.println("The subtraction between two numbers is " + (num1 - num2));
		System.out.println("The multiplication of two numbers is " + (num1 * num2));
		System.out.println("The division of two numbers is " + (num2 / num1));
		System.out.println("The remainder of two numbers is " + (num1 % num2));

	}

	public void relationalOperators() {

		/*
		 * Relational (Comparison) Operators: (== Equals , != Not equals, > Greater
		 * than, < Less than, >= Greater than equals to, <= Less than equals to )
		 */

		System.out.println("\n========== Relational Operators in Java ==========");
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));

	}

	public void logicalOperators() {

		/*
		 * Logical Operators: && (AND), || (OR), ! (NOT) For this to understand you need
		 * to know the truth table in digital electronics for AND gate, OR gate & NOT
		 * gate
		 */

		boolean isQA = true;
		boolean knowsJava = false;
		System.out.println("\n========== Logical Operators ==========");
		System.out.println("isQA && knowsJava : " + (isQA && knowsJava));
		System.out.println("isQA || knowsJava : " + (isQA || knowsJava));
		System.out.println("!isQA : " + (!isQA));
		System.out.println("!knowsJava : " + (!knowsJava));

	}

	public void assignmentOperators() {

		/* Assignment Operators: =, +=, -=, *=, /= */

		System.out.println("\n=== Assignment Operators ===");
		int a = num1;
		System.out.println("Initial value of a: " + a); // value of num1 is now assigned to variable 'a'

		a += num2;
		System.out.println("a += num2 : " + a);
		a -= num2;
		System.out.println("a -= num2 : " + a);
		a *= num2;
		System.out.println("a *= num2 : " + a);
		a /= num2;
		System.out.println("a /= num2 : " + a);

	}

	public void incrementDecrementOperator() {
		
		/* Increment / Decrement Operators:x++, ++x, x--, --x */
		System.out.println("\n========== Increment / Decrement Operators ==========");
		int x = num1;

		System.out.println("Original x: " + x);
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("After post increment: " + x);
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("After post-decrement: " + x);
        System.out.println("Pre-decrement (--x): " + (--x));

	}
	
	public void ternaryOperator() {
		
		/*condition ? value_if_true : value_if_false */		
		System.out.println("\n========== Conditional (Ternary) Operator ==========");
		String result = (num1 > num2) ? "num1 is greater" : "num2 is greater or equal";
		System.out.println("result: " + result);
		
	}

}
