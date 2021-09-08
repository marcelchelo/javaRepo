package isUnique;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

//Given a string the program should determine if the string is unique.  (has repeat characters)
//example:    "Hello"    Not unique 
//			"name"  is Unique

public class isUnique {
public static void main (String [] args) {
	
	
	

	
	//obtain string from user 
	System.out.println("Enter a word");
	
	Scanner keyboard = new Scanner(System.in);
	String word = keyboard.nextLine();
	
	
	System.out.println(isUnique(word));
	
	
}

private static boolean isUnique(String word) {
	
	//There are only 128 ASCII characters (ENGLISH), anything more return false immediatly  AaBb!123@#$
	
	if (word.length() > 128) return false;
	
	boolean [] char_set = new boolean[128]; //array of fixed size 128
	for (int i=0 ; i<word.length(); i++) {//traverse the  given word.
		int val = word.charAt(i);  //obtain ascii value at index I
		System.out.println(val); //print the value to screen   (not needed)
		if(char_set[val] == true) {   //we are essentially putting char a in index 97(its corresponding ascii value) and checking if it exists there. If it does return false bc it is a repeat.
			return false;
		}
		char_set[val] = true;     
	}
	
	
	
	
	return true;
	
	
}
}
