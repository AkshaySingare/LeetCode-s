package leetCodes;

public class ValidPalindrome_125 {

	 public static boolean isPalindrome(String s) {
	        
	        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        System.out.println(str);
	        int j=str.length()-1;

	        boolean flag = true;
	        for(int i=0;i<j;i++,j--){
	            if(str.charAt(i) != str.charAt(j)){
	                flag = false;
	                break;
	            }
	        }
	        return flag;
	    }
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("aba"));

	}

}
