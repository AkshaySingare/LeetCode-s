// 8. String to Integer (atoi)
package leetcode;

class Solution {
	public int myAtoi(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.trim();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((i == 0 && (ch == '-' || ch == '+')) || (ch >= '0' && ch <= '9')) {
				sb.append(ch);
			} else if (i >= 0 && !(ch >= '0' && ch <= '9')) {
				break;
			}
		}
		if (sb.length() == 1 && !(s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
			sb.setCharAt(0, '0');
		} else if (sb.length() == 0)
			return 0;

		try {
			Integer.parseInt(sb.toString());
		} catch (Exception e) {
			if (sb.charAt(0) == '-') {
				return Integer.MIN_VALUE;
			} else {
				return Integer.MAX_VALUE;
			}
			// TODO: handle exception
		}
		return Integer.parseInt(sb.toString());
	}
}

public class demo {
	public static void main(String args[]) {
		String str = " b11228552307";
		Solution s = new Solution();

		System.out.println(s.myAtoi(str));
	}
}