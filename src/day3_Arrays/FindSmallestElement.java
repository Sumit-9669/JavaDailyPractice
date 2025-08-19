package day3_Arrays;

public class FindSmallestElement {

	public static void main(String[] args) {
		/*
		 * Problem Statement: Find the smallest element in an array.
		 * 
		 * Explanation:
		 * 
		 * Similar to finding the largest, but instead look for smaller values.
		 * 
		 * Code:
		 */

		int[] arr = { 12, 45, 67, 23, 89, 34, 90 };
		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		System.out.println("The smallest element in an Array is " + min);
	}
}
