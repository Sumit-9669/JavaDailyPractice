package day3_Arrays;

public class ArrayBasics {

	/*
	 * What is an Array?
	 * 
	 * An array is a collection of similar data types (all integers, all strings,
	 * all floats, etc.).
	 * 
	 * It has a fixed size (once created, you cannot change its length).
	 * 
	 * It allows us to access elements using an index (position).
	 * 
	 * Example: int[] numbers = {10, 20, 30, 40};
	 * 
	 * Index → 0, 1, 2, 3
	 * 
	 * Values → 10, 20, 30, 40
	 */

	public static void main(String[] args) {
		// write a program to declare, initialize, and print elements of an array.
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Array elements are: ");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

	}

}
