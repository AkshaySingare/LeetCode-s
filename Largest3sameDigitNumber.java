package leetcode;

class Solution4 {
	public String largestGoodInteger(String num) {
		StringBuilder sb = new StringBuilder();
		int sum = 0;

		for (int i = 0; i < num.length() - 2; i++) {
			char ch1 = num.charAt(i);
			char ch2 = num.charAt(i + 1);
			char ch3 = num.charAt(i + 2);
			if (ch1 == ch2 && ch2 == ch3) {
				int chsum = (ch1 - '0') + (ch2 - '0') + (ch3 - '0');
				if (chsum >= sum) {
//					System.out.println("sb  " + sb + "  " + chsum);
					sum = chsum;
					sb.setLength(0);
					sb.append(num.substring(i, i + 3));
				}
			}
		}

		return sb.toString();
	}
}

public class Largest3sameDigitNumber {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.largestGoodInteger("6777133339"));
	}

}
