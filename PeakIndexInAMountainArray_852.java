package leetCodes;

public class PeakIndexInAMountainArray_852 {

	 public static int peakIndexInMountainArray(int[] arr) {
		 
		 int start = 0;
		 int end = arr.length-1;
	
		 int ind = 0;
		 
		 while(start <= end) {
			 
			int mid = start + (end-start)/2;
			 if(mid-1 < 0 || mid+1 > arr.length-1) break;
			 
			 if(arr[mid] > arr[mid+1]) { // not desending part
				 ind = mid;
				 end = mid-1;
				 
			 }
			 else if(arr[mid] > arr[mid-1] ){  // in asending part
				 ind  = start;
				 start = mid+1;
				 
			 }
			 System.out.println(mid);
		 }
		 
		 return ind;
	 }
	
	public static void main(String[] args) {
		
		System.out.println("Index "+peakIndexInMountainArray(new int[] {3,5,3,2,0}));

	}

}
