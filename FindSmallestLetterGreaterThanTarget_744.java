package leetCodes;

import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget_744 {

	public static char findChar(char[] letters, char target) {
		
		
		for(char ch: letters) {
			
			if(target<ch) return ch;
		}
		
		
		return letters[0];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch[]= {'x','x','y','y'};
		
		
		 System.out.println("Enter Target Charecter..."); 
		 char tar = sc.next().charAt(0);
		  
		  System.out.println(findChar(ch, tar));
		 	
		
//		String c = "a";
//		
//		System.out.println(c.compareTo("a"));
	}

}
