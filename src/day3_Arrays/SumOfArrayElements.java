package day3_Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		/*
		 * Problem Statement: Find the sum of all elements in an array.
		 * 
		 * Explanation:
		 * 
		 * Initialize sum = 0.
		 * 
		 * Traverse array and keep adding elements.
		 */
		int[] arr = { 12, 45, 67, 23, 89, 34, 90 };
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("The sum of all elements in an array: " + sum);

	}

}
