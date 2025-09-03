package day4_Strings;

public class SubString_Example {

	public static void main(String[] args) {
		// Write a program to extract part of a string using the substring() method.
		
		/* 1. substring(startIndex) → returns substring from given index to end.
		   2. substring(startIndex, endIndex) → returns substring from startIndex to endIndex-1.
		   👉 Remember: Index starts from 0.
		 */
		
		String text = "Automation Testing";
		// Step 2: Substring from index
        String sub1 = text.substring(11);   // from index 11 to end
        System.out.println("Substring from index 11: " + sub1);
        
        // Step 3: Substring between two indexes
        String sub2 = text.substring(0, 10);  // from index 0 to 9
        System.out.println("Substring from index 0 to 9: " + sub2);
        
        // Step 4: Extract first word and last word
        String firstWord = text.substring(0, 10);
        String lastWord = text.substring(11);
        
        System.out.println("First Word: " + firstWord);
        System.out.println("Last Word: " + lastWord);
	}

}
