package leetCodes;

public class FindPeakElement_162 {

	  public static int findPeakElement(int[] nums) {


		          
        int start = 0;
        int end = nums.length-1;
        while(start < end){

            int mid = start + (end - start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
return start;
		  
	        // int Iind = 0;
	        // int Jind = 0;
	        // int max = Integer.MIN_VALUE;
	        // for(int i=0,j=nums.length/2;i<=nums.length/2;i++,j++){

	        //     try{
	        //     if(nums[i]>nums[i+1]){                
	        //         if(max<nums[i]){
	        //              max = nums[i];
	        //              Iind  = i;
	        //         }
	                   
	        //     }else {                
	        //             if(max < nums[i+1]){
	        //                 max = nums[i+1];
	        //                 Iind = i+1;
	        //             }
	        //     }
	        //     if(j<nums.length-1 && nums[j]>nums[j+1]){
	        //          if(max < nums[j]){
	        //             Jind = j;
	        //             max = nums[j];
	        //          }
	        //     }else{
	        //         if(max < nums[j+1]){
	        //             Jind = j+1;
	        //             max = nums[j+1];
	        //          }
	        //     }
	        //     }catch(ArrayIndexOutOfBoundsException e){

	        //     }
	        //     System.out.println(Iind);
	        // }
	        // return nums[Iind]>nums[Jind]?Iind:Jind;

	    }
	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[] {1,2}));
	}

}
