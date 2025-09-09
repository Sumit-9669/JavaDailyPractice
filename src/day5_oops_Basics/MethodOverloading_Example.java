package day5_oops_Basics;

/*📘 Method Overloading in Java
🔹 Explanation

Method Overloading means defining multiple methods in the same class with the same name but different parameters (different type or number of arguments).

It’s a form of compile-time polymorphism.

The compiler decides which method to call based on the arguments you pass.

✅ Same method name, ✅ Different parameter list, ❌ Not return type alone.*/

class CalculatorOverload {
	// add two integers
	int add(int a, int b) {
		return a + b;
	}

	// add three integers
	int add(int a, int b, int c) {
		return a + b + c;
	}

	// add two doubles
	double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading_Example {

	public static void main(String[] args) {

		CalculatorOverload calc = new CalculatorOverload();

		// Calling overloaded methods
		System.out.println("Sum of two integers: " + calc.add(10, 20));
		System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
		System.out.println("Sum of two doubles: " + +calc.add(6.5, 10.8));

	}

}
