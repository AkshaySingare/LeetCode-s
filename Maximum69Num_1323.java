package leetcode;

class Solution6 {
	public int maximum69Number(int num) {
		int temp = num, max = num, val = 0;
		int count = 0, maxval = 0;
		while (temp != 0) {
			temp /= 10;
			count++;
		}
		temp = num;
		while (count != 0) {
			count--;
			val = (int) Math.pow(10, count);
			int div = num / val; // 6
			num %= val; // 999
			val *= 3; // 3000
			if (temp > maxval) {

				if (div == 6) {
					maxval = max + val; // 6999+3000 = 9999
				} else {
					maxval = max - val;
				}
				max = temp;
			}

		}
		return temp > maxval ? temp : maxval;
	}
}

public class Maximum69Num_1323 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		System.out.println(s.maximum69Number(9696));
	}
}
