package leetCodes;

//Given an array of integers nums which is sorted in ascending order,
//and an integer target, write a function to search target in nums. 
//If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.

public class BinarySearch_704 {
public static int search(int[] nums, int target) {
        
        int start = 0;
        int m = nums.length/2;
        int end = nums.length-1;

        while(start <= end){
            
            m = start+ (end-start /2);

            if(nums[m]==target) return m;
            else if(nums[m] < target) start=m+1;
            else end = m-1;
        }

    return -1;
    }

	public static void main(String[] args) {
		
		System.out.println(search(new int[] {2,4,5,8,10}, 10));

	}

}
