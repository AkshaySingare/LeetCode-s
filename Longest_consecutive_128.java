package leetCodes;

import java.util.Arrays;

class SolutionLong {
    public int longestConsecutive(int[] nums) {
        
    	if(nums.length==0) return 0;
         Arrays.sort(nums); // 0 1 1 2
         
         for(int a:nums) {
        	 System.out.print(a+" ");
         }
         
         int count=1,max=0;
         for(int i=0;i<nums.length-1;i++) { // 0 1 1 2 
        	 
        	int val = nums[i];  //0
        	if(val == nums[i+1]) continue;
        	
        	if(val+1 == nums[i+1]) { //  1+1=1
        		count++; //  1
        	}
        	else if(count>max) { //3>0
        		max=count; //3
        		count=1;
        	}
        	else {
        		count=1;
        	}
        	 
         }
         if(count>max) {
     		max=count;
     	}
         return max;
    }
}
public class Longest_consecutive_128 {

	public static void main(String x[]) {
		SolutionLong s = new SolutionLong();
		
		int a[]={1,0,1,2}; 
		
		int res=s.longestConsecutive(a);
		System.out.println("\n"+res);
	}
}
