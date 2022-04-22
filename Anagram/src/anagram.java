import java.util.HashMap;
import java.util.Map;

public class anagram {

	public static void main(String[] args) {
	
		String text1 = "marcelo";
		String text2 = "olecaam";
		System.out.println(isAnagram2(text1,text2));
	}

	 public static boolean isAnagram2(String s, String t) {
	        
	 //create hasmap of eachString         
	        
	        Map<Character, Integer> sMap = new HashMap<>();
	        Map<Character, Integer> tMap = new HashMap<>();
	        
	        for(int i = 0; i < s.length(); i++) {
	        	
	        	// :: new way to write lambda expressions 
	            sMap.merge(s.charAt(i), 1, Integer::sum);
	            
	            tMap.merge(t.charAt(i), 1, Integer::sum);
	        }
	        
	        for(Character c : sMap.keySet()) {
	            if(!sMap.get(c).equals(tMap.get(c))) return false;
        }
	        return true;
	    }
	 
	 public static boolean isAnagram1(String s, String t) {
	        
		 
	        Map<Character, Integer> sMap = new HashMap<>();
	        Map<Character, Integer> tMap = new HashMap<>();
	        
	        //get String s map it to sMap.
	        
	        for (int i =0 ; i<s.length() ; i++) {
	        	sMap.put(s[i], Integer::sum);
	        }
		        
		   
		        return true;
		    }
	

	
	
	
}