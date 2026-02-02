package leetCodes;

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of 
// money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class RichestCustomerWealth_1672 {

	
	  public static int maximumWealth(int[][] accounts) {
	      
		  int maxSum=0;
		  for(int i=0;i<accounts.length;i++) {
			  
			  int sum=0;
			  for(int val :accounts[i]) {
				  sum+=val;
			  }
			  if(maxSum<sum) maxSum=sum;
		  }
		  return maxSum;
	    }
	public static void main(String[] args) {
		
		System.out.println(maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));

	}

}
