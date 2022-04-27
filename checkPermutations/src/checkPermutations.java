/**
 * 
 */

/**
 * Check if one word is a permutation of another 
 * ex:  God  & dog
 * 
 *  return true or false 
 * 
 * 
 * @author marchelo
 *
 */

import java.util.Arrays;
import java.util.Scanner;
public class checkPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter word 1");
		String word1 = keyboard.nextLine();
		
		System.out.println("Enter word 2");
		String word2 = keyboard.nextLine();
		
		boolean result =  isPerm(word1 , word2); 
		
		
		System.out.print(result);
		
	}
	//return a sorted string 
	public static String sort (String word) {
		//convert word to sorted array
		char [] content = word.toCharArray();
		
		Arrays.sort(content);

		return new String(content);  //cast a string to the sorted array and return. 
	}
	
	
	
	public static boolean isPerm(String word1 , String word2) {
		//id one word is longer than the other,  return false right away
		
		if( word1.length() != word2.length()) {
			return false;
		}
	
		
		return sort(word1).contentEquals(sort(word2));
		
		
	}
	
	public static boolean isPerm2(String word1 , String word2) {
		//Another solution that uses more memory but is fater
		//initialize an array of size 26 for each letter of the alphabet
		// ++1 every time same character appears, at the index of the char's ascii value. 
		//to check second word --1 every time a character appears. 
		//final solution chould have an array of 0's or null.  Else it is not a permutation. 
		
		int [] anArray = new int[10];
		
		 
		
		return false;
		
		
		
	}

}
