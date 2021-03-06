package isUnique;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//Given a string the program should determine if the string is unique.  (has repeat characters)
//example:    "Hello"    Not unique 
//			"name"  is Unique

//Marcelo Villalba

public class isUnique {
public static void main (String [] args) {
	
	
	

	
	//obtain string from user 
	System.out.println("Enter a word");
	
	Scanner keyboard = new Scanner(System.in);
	String word = keyboard.nextLine();
	
	
	System.out.println(isUnique2(word));
	
	
}

public static boolean isUnique2(String word) {
	// Create hash table
	HashMap<Character, Integer> stringHash = new HashMap<Character, Integer>();
	
	//put each char in a hashtable/counter
	for(char letter: word.toCharArray()) {
		//stringHash.containsKey(letter) ?      -> pretty readable check if
		stringHash.put(letter, stringHash.containsKey(letter) ?   //if this is true   do next line until :   else do whatever is after :     (conditional operator )
								(stringHash.get(letter)+1) : 1);
		
	}
	
	System.out.println(stringHash);
	
    for ( Integer value: stringHash.values()) {
        if ( value != 1) {
            return false;
        }
    }
	
	return true;
}

private static boolean isUnique(String word) {
	
	//There are only 128 ASCII characters (ENGLISH), anything more return false immediatly  AaBb!123@#$
	
	if (word.length() > 128) return false;
	
	boolean [] char_set = new boolean[128]; //array of fixed size 128
	for (int i=0 ; i<word.length(); i++) {//traverse the  given word.
		int val = word.charAt(i);  //obtain ascii value at index I
		//System.out.println(val); //print the value to screen   (not needed)
		if(char_set[val] ) { //we are essentially putting char a in index 97(its corresponding ascii value) and checking if it exists there. If it does, return false bc it is a repeat.
			return false;
		}
		
		//Test, Print the index location of letter m
		System.out.println(char_set[109]);  //Test Location 109 is for letter m.  it will return true  if word is marcelo (my name)
		char_set[val] = true;    
		
		
	}
	
	
	
	
	return true;
	
	
}
}
