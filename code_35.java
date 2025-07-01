package leetcode;

class Solution {
	public int searchInsert(int[] nums, int target) {
		if (target < nums[0])
			return 0;
		else if (target == nums[0])
			return 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (target > nums[i] && target <= nums[i + 1]) {
				if (target == nums[i])
					return i;
				return i + 1;
			}
		}
		return nums.length;
	}
}

public class code_35 {
	public static void main(String x[]) {
		Solution s = new Solution();
		int a[] = { 10, 20, 30 };
		System.out.println(s.searchInsert(a, 40));
	}
}
