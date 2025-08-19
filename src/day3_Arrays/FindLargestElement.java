package day3_Arrays;

public class FindLargestElement {

	public static void main(String[] args) {
		/*
		 * Problem Statement: Find the largest element in an array.
		 * 
		 * Explanation:
		 * 
		 * Start by assuming the first element is the largest.
		 * 
		 * Compare it with each element.
		 * 
		 * Update the largest if a bigger value is found.
		 */

		int[] arr = { 12, 45, 67, 23, 89, 34, 90 };
		int max = arr[0];

		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("The largest element in an array is " + max);
	}
}
