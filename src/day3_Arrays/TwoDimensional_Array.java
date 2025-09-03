package day3_Arrays;

public class TwoDimensional_Array {

	public static void main(String[] args) {
		// Problem Statement: Work with a 2D array (matrix). Print all elements.
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("2D Array (Matrix):");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
