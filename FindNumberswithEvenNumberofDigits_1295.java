package leetCodes;

public class FindNumberswithEvenNumberofDigits_1295 {

	
	 public static int findNumbers(int[] nums) {
	        
		 int even=0;
		 for(int n:nums) {
			 int count = 0;
			 while(n!=0) {
				 n/=10;
				 count++;
			 }
			 if(count%2==0) even++;
		 }
		 return even;
		 
	    }
	public static void main(String[] args) {
		
		System.out.println(findNumbers(new int[]{1,22,3,4,5}));

	}

}
