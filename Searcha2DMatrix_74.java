package leetCodes;

public class Searcha2DMatrix_74 {
	
	 static boolean searchInRow(int [][]matrix, int row, int target) {
		 int start =0;
		 int end = matrix[row].length-1;
		 
		 while(start <= end) {
			 
			 int mid = start + (end-start)/2;			 
			 if(matrix[row][mid] == target) return true;
			 else if(matrix[row][mid] > target) end = mid-1;
			 else start = mid+1;			 
		 }
		 return false;
	 }
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		int start = 0;
		int end = matrix.length-1;
		
		int lastIndex = matrix[0].length-1;
		int firstIndex = 0;
		
		while(start <= end) { // first search row that have target
			
			int mid = start + (end -start)/2;
			
			System.out.println(mid+" Last Column Value  "+matrix[mid][lastIndex]);
			if(matrix[mid][firstIndex] <= target && matrix[mid][lastIndex] >= target) {
				return searchInRow(matrix,mid,target);
			}
			else if(matrix[mid][firstIndex] > target)
				end = mid-1;
			else
				start = mid+1;			
		}
		return false;
        
    }
	public static void main(String[] args) {
		
		System.out.println(searchMatrix(new int[][] {
			{1}
			}, 2));

	}

}
