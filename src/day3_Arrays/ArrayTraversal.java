package day3_Arrays;

public class ArrayTraversal {

	public static void main(String[] args) {
		/*
		 * Problem Statement: Write a program to traverse an array using both for and
		 * for-each loops.
		 * 
		 * Traversal means visiting every element in the array (one by one).
		 * 
		 * Explanation:
		 * 
		 * for loop → gives control over indexes.
		 * 
		 * for-each loop → used for simple iteration when index is not needed.
		 */

		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("\n Array travesal using for loop: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The number at index " + i + ": " + arr[i]);
		}

		System.out.println("\n Array travesal using for-each loop: ");
		for (int num : arr) {
			System.out.println("value = " + num);
		}

	}

}
