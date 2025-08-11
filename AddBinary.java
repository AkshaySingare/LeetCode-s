package leetcode;

class Solution3 {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		boolean flag = true;
		for (int i = a.length() - 1, j = b.length() - 1; flag; i--, j--) {

			int dig1 = (i >= 0) ? a.charAt(i) - '0' : 0;
			int dig2 = (j >= 0) ? b.charAt(j) - '0' : 0;

			int sum = dig1 + dig2 + carry;
			if (sum % 2 == 0) {
				if (sum == 0) {
					sb.append('0');
					carry = 0;
				} else {
					sb.append('0');
					carry = 1;
				}
			} else if (sum == 1) {
				sb.append('1');
				carry = 0;
			} else {
				sb.append('1');
				carry = 1;
			}
			if (j < 0 && i < 0) {
				carry = 0;
				flag = false;
			}
		}
		int val = 0;
		try {
			val = Integer.parseInt(sb.reverse().toString());
		} catch (Exception e) {
			int i = sb.indexOf("1");
			while (i != 0) {
				i--;
				sb.deleteCharAt(i);
			}
			return sb.toString();
		}
		if (val == 0)
			return "0";
		else if (val == 1)
			return "1";
		else {
			int i = sb.indexOf("1");
			while (i != 0) {
				i--;
				sb.deleteCharAt(i);
			}
			return sb.toString();
		}
	}
}

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 s = new Solution3();
		System.out.println(s.addBinary("100", "110010"));
	}

}
