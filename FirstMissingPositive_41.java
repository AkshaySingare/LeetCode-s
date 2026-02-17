package leetCodes;

public class FirstMissingPositive_41 {
	
	public static int firstMissingPositive(int[] nums) {
	
		int i=0; // 3,4,-1,1
		while(i<nums.length) { // 0 < 4
			int currect = nums[i]-1; // 2
			if(currect < 0 || currect >= nums.length) {
				i++;
				continue;
			}
			
			if (nums[i] != nums[currect]) { 
				int temp = nums[i];
				nums[i] = nums[currect];
				nums[currect] = temp;
			}else i++;	
		}
		
		
		System.out.println("Arrray Values ");
		for(int k=0;k<nums.length;k++) {
			System.out.print(nums[k]+" ");
		}
		System.out.println();
		
		i=0;
		int j=1;
		while(i<nums.length) {
			
			if(nums[i]>0) {
				if(nums[i] != j) return j;
				else j++;
			}
			i++;
			
		}
		return j;
        
    }
	
	public static void main(String[] args) {
		
		System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));

	}

}
