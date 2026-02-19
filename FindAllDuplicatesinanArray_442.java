package leetCodes;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray_442 {
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        int i=0; //  4,3,2,7,8,2,3,1
        while(i<nums.length) {
        	
        	int currectInd = nums[i]-1; // Elements Index
        	if(nums[i] != nums[currectInd]) { // Swap the Elements
        		int temp = nums[currectInd];
        		nums[currectInd] = nums[i];
        		nums[i] = temp;
        	}else i++;
        }
        
        i=0;
        while(i<nums.length) { // Find the Duplicates
//        	System.out.print(nums[i]+" ");
        	if(nums[i] != i+1) list.add(nums[i]); // add wrong element prasent in wrong the wrongindex
        	i++;
        }
        
        return list;
    }
	public static void main(String[] args) {
		
		System.out.println(findDuplicates(new int[] {4,3,2,7,8,2,3,1}));

	}

}
