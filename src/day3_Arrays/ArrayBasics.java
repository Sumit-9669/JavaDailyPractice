package day3_Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// Code a program to declare, initialize, and print elements of an array.
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Array elements are: ");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

	}

}
