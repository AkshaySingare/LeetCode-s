package leetCodes;

public class MissingNumber_268 {

	   public static int missingNumber(int[] nums) {
	        
	        int i=0;
	        while(i<nums.length){ // 3 0 1
	            int cur = nums[i]; // find index 3

	            if(cur >= nums.length){
	                i++;
	                continue;
	            } 

	            if(nums[i] != nums[cur]){ // swap to belonging index
	                int temp = nums[i];
	                nums[i] = nums[cur];
	                nums[cur] = temp;
	            }else i++;
	        }

	        for(int j=0;j<nums.length;j++){
	            if(nums[j] != j ) return j;
	        }
	    return nums.length;
	    }
	
	public static void main(String[] args) {
			System.out.println(missingNumber(new int[] {3,0,1}));
	}

}
