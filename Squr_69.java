package leetcode;

class Solution5 {
	public int mySqrt(int x) {
		if (x == 1 || x == 2 || x == 3)
			return 1;
		for (int i = 2; i <= (x / 2) + 1; i++) {

			if ((long) i * i >= x) {
				if ((long) i * i == x) {
					return i;
				} else {
					return i - 1;
				}
			}
		}
		return 0;
	}
}

public class Squr_69 {
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(s.mySqrt(2147483647));

	}

}
