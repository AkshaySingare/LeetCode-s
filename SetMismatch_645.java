package leetCodes;

public class SetMismatch_645 {

	 public static int[] findErrorNums(int[] nums) {
	        
		 int i=0;
		 while(i<nums.length) {
			 int currect = nums[i]-1;
			 if(nums[i] != nums[currect]) {
				 int temp = nums[i];
				 nums[i] = nums[currect];
				 nums[currect] = temp;
			 }else i++;
		 }
		 i=0;
		 while(i<nums.length) {
			 
			 if(nums[i] != i+1) {
				 return new int[] {nums[i],i+1};
			 }
			 i++;
		 }
		 return new int[] {-1,-1};
		 
	    }
	public static void main(String[] args) {
		
		int a[]=findErrorNums(new int[] {1,2,2,4});
		System.out.println(a[0]+" "+a[1]);

	}

}
