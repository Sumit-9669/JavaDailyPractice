package day2_Loops;

public class WhileLoopExample {

	public static void main(String[] args) {
		//Program to count down from 3 to 1 and then displays "Happy New Year!!" at the end:
		
		int countDown = 3;
		while(countDown > 0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Happy New Year 2025...!!!");
	}

}
