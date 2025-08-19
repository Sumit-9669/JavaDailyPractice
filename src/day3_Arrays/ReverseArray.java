package day3_Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		/*
		 * Problem Statement: Print the array in reverse order.
		 * 
		 * Explanation:
		 * 
		 * Start from last index → go till 0.
		 */

		int[] numbers = { 2, 3, 5, 8, 10, 22 };
		System.out.println("Array in reverse order: ");

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

	}

}
