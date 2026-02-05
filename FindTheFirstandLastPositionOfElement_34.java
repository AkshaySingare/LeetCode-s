package leetCodes;

public class FindTheFirstandLastPositionOfElement_34 {
	
	public static int position(int nums[], int target,boolean isFirst) {
		
		int start = 0;
		int end = nums.length-1;
		
		int mid =end/2;
		if(isFirst)
			end= mid;
		else 
			start = mid+1;
		
		int ind = -1; // for store the index of  element
		while(start<=end) {
			
			mid = start + (end-start)/2;
			
			if(nums[mid] < target) {
				start = mid+1;
				
			}else if(nums[mid]> target) {
				end = mid-1;
			}else {
				ind = mid;	
				if(isFirst) end = mid-1;
				else start = mid+1;
			}
			
		}
		
		return ind;
	}

	public static  int[] searchRange(int[] nums, int target) {
		
		int index[] = new int[2];
		 index[0] = -1;
	        index[1] =-1;

			index[0]=position(nums,target,true);
	        if(index[0] != -1)
			index[1]=position(nums,target,false);
		
		return index;
	}
	
	public static void main(String[] args) {
		
		int a[] = searchRange(new int[]{5,7,8,8,10}, 7);
		System.out.println(a[0]+" "+a[1]);

	}

}
