package leetcode;

//344  Write a function that reverses a string. The input string is given as an array of characters s.
class Solution {
	public void reverseString(char[] s) {
		int mid = s.length / 2;
		int last = s.length - 1;
		for (int i = 0; i <= mid && last >= mid; i++, last--) { // 0
			char ch = s[i];
			s[i] = s[last];
			s[last] = ch;
		}
		for (char ch : s) {
			System.out.print(ch + " ");

		}
	}
}

public class demo {

	public static void main(String x[]) {

		Solution s = new Solution();
		char ch[] = { 'a', 'a', 'k' };
		s.reverseString(ch);

	}
}
