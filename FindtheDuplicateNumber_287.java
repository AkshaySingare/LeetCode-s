package leetCodes;

// 1 to n array  elements find Dublicate Elemnts

public class FindtheDuplicateNumber_287 {
	
	 public static int findDuplicate(int[] nums) {
	        
		 int i = 0;
		 while(i<nums.length) {
			 int cur = nums[i] -1;
			 if(nums[i] != nums[cur]) {
				 int temp = nums[i];  // 3
				 nums[i] = nums[cur]; // 4
				 nums[cur] = temp; // 3
			 }else i++;
		 }
		 i=0;
		 while(i<nums.length) {
			 if(nums[i] != i+1) {
				 return nums[i];
			 }
			 i++;
		 }
		 return -1;
	 }

	public static void main(String[] args) {
		
		System.out.println(findDuplicate(new int[] {1,3,4,2,2}));

	}

}
