package day2_Loops;

public class Pattern_Programs {

	public static void main(String[] args) {
		// Prints right triangle and inverted right triangle using loops.
		// Pattern 1: Right triangle
		System.out.println("\n Right Angled triangle:");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Pattern 2: Inverted right triangle
		System.out.println("\n Inverted right Angled triangle:");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
