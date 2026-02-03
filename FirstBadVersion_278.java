package leetCodes;

public class FirstBadVersion_278 {
	
	public static boolean isBadVersion(int version) {		
	    return version >= 1702766719;
	}

	 public static int firstBadVersion(int n) {
	        
	        int mid = 1;
	        int start = 0;
	        int end = n;
	        int ans= mid;
	        
	        while(start<=end ){ //1<=3

	            mid = start+ (end-start)/2; // 2

	            System.out.println("Start "+start+" End "+end+" Mid "+mid);

	            if(isBadVersion(mid)) {
	            	end = mid-1;  //f  
	            	ans=mid;
	            }
	            else start = mid+1; //
	            
	        }
	    return mid;
	    } 
	public static void main(String[] args) {
		
		System.out.println(firstBadVersion(2126753390));
	}

}
