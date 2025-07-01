package leetcode;

class Solution {
	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == 0 && digits[i] == 9) {
				int dig[] = new int[digits.length + 1];
				dig[0] = 1;
				digits[i] = 0;
				for (int j = 0, k = 1; j < digits.length; j++, k++) {
					dig[k] = digits[j];
				}
				return dig;
			} else if (digits[i] == 9)
				digits[i] = 0;
			else {
				digits[i]++;
				break;
			}

		}
		return digits;
	}
}

class demo {
	public static void main(String x[]) {

		Solution s = new Solution();

		int a[] = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1,
				1, 7, 4, 0, 0 };
		for (long num : s.plusOne(a)) {
			System.out.print(num);
		}

	}
}
