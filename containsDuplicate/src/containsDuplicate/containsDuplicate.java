//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//Input: nums = [1,2,3,1]
//Output: true
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

package containsDuplicate;
import java.util.Scanner;
import java.util.Arrays;

public class containsDuplicate {

	public static void main(String[] args) {
	
		int [] numArray = { 1,4,2,7,45,34,23,65,34};
		
		Arrays.sort(numArray);
		
		System.out.println(containsDuplicate(numArray));
		
	}

	private static boolean containsDuplicate(int [] sample) {
		// TODO Auto-generated method stub
		for (int i=0 ; i<sample.length; i++) {
			if (sample[i] == sample[i+1] ){
				return true;
			}
		}
		return false;
	}
	
}
