package leetCodes;

class Solutionsm {
    public int smallestNumber(int n) {
    	int bin=0,div=1;
        while(n!=0) {
        	int rem = n%2;   	
        	bin = bin+rem*div;
        	div *=10;
           	n/=2;
        }
        System.out.println(" real binaryy "+bin);

        int setbit =0;
        while(bin!=0) {
        	bin /=10;
        	setbit = setbit*10+1;
        }
        
       System.out.println(" modified binary  "+setbit);
        int val=0,count=0;        
        while(setbit!=0) {
        	
        	int pow = (int)Math.pow(2, count);
        	int rem = setbit%10;
        	val = val+(rem*pow);
        	setbit /=10;
        	count++;      	
        	
        }
         return val;
    }
}
public class Smallest_setBit_3370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solutionsm s = new Solutionsm();		
		System.out.println(s.smallestNumber(5));
	}

}
