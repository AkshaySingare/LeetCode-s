package leetcode;

class Solution1 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int j = 0, i = m; i < nums1.length && j < nums2.length; i++, j++) {
			nums1[i] = nums2[j];
		}
		for (int i = 0; i < nums1.length - 1; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {
					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + "  ");
		}
	}
}

public class Merge_sorted_arry_88 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		s.merge(nums1, 3, nums2, 3);
		// TODO Auto-generated method stub

	}

}
