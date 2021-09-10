//Give an an array return index values where its content add up to a target. 
//		Ex: {2,3,4,5,6}
//		Target = 8;
//		
//		Return 0 ,4 and 1,3
		
public class twoSum {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 11;
		int numbers [] = {2,3,4,5,6};
		
		for (int i = 0; i <= numbers.length-1; i ++) {
			int a = numbers[i];
			int indexA =i;
			
			for (int j = 1 ;  j <= numbers.length-1; j++) {
				int b =  numbers[j];
				int indexB = j;
				
				if (a + b == target) {
					System.out.println(indexA + " " + indexB);
				}
			}
			
		}
		
		
		
	}
}
	
	
				
					
					
					
					
		
		
		