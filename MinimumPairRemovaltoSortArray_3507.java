package leetCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPairRemovaltoSortArray_3507 {
	
	
	public static List<Integer> check(List<Integer> list){
		
		int minSum = Integer.MAX_VALUE;
		int l=0,r=1;
		
		int left=0;
		for(;r<list.size();r++,l++) {
			
			int sum = list.get(l)+list.get(r); 
			if(sum<minSum) {
				minSum=sum;
				
				left = l;
			}
			
		}
		
		list.remove(++left);
		list.set(--left, minSum);
		
		return list;
	}

	public static int minimumPairRemoval(int[] nums) {
        		
		List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
		int count=0;
		
		System.out.println(list);
		
		for(int i=0;i<list.size()-1;i++){

            if(list.get(i) >= list.get(i+1) ){ 
//            	System.out.println(" I "+i+" "+list.get(i)+" "+list.get(i+1));
                list = check(list);
                System.out.println(list);
                
                count++;
                i=-1;

            }
            
        }
		
		return count;
		
    }
	
	public static void main(String[] args) {
		
		int num[]= {1,2,2};
		
		System.out.println(minimumPairRemoval(num));

	}

}
