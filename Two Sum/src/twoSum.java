//Give an an array return index values where its content add up to a target. 
//		Ex: {2,3,4,5,6}
//		Target = 8;
//		
//		Return 0 ,4 and 1,3

import java.util.HashMap;
public class twoSum {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numbers [] = {2,5,76,7};
		int target = 9;

		System.out.println(twoSumOptimal(numbers, target)[0] + "  ,  " + twoSumOptimal(numbers, target)[1]);
	
		
		
		
		
		//Brute force solution
		
		
		
//		int target = 6;
//		int numbers [] = {3,3};
//		
//		for (int i = 0; i <= numbers.length-1; i ++) {
//			int a = numbers[i];
//			int indexA =i;
//			
//			for (int j = 1 ;  j <= numbers.length-1; j++) {
//				int b =  numbers[j];
//				int indexB = j;
//				
//				if (a + b == target) {
//					System.out.println(indexA + " " + indexB);
//				}
//			}
//			
//		}
		
		
		
	}

	private static int[] twoSumOptimal(int array [], int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i =0 ; i<array.length ; i++) {
			if(map.containsKey(array[i])) {
				return new int [] {map.get(array[i]), i}; 
			}
				map.put(target - array[i], i);
		}
		
		return new int[0];
		}
		
		
	
}
	
	
				
					
					
					
					
		
		
		