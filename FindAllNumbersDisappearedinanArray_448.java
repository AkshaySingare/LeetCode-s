package leetCodes;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray_448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> list = new ArrayList<Integer>();
       
       int i=0;
       while(i<nums.length) {
    	   
    	   int cur = nums[i]-1;
    	   if(nums[cur] == nums[i]) {
    		   i++;
    	   }else if(nums[i] == i+1) {
    		   i++;
    	   }else {
    		   int temp = nums[i];
    		   nums[i] = nums[cur];
    		   nums[cur] = temp;
    	   }
       }
       for(int j=0;j<nums.length;j++) {
    	   if(nums[j] != j+1) list.add(j+1);
       }
       
       return list;
       
    }
	public static void main(String[] args) {
		
		System.out.println(findDisappearedNumbers(new int[] {1,1}));

	}

}
