package leetcode;

class Solution {
	public int strStr(String haystack, String needle) {
		StringBuilder sb = new StringBuilder();
		if (haystack.length() < needle.length())
			return -1;
		boolean flag = true;
		for (int i = 0; i < haystack.length(); i++) {
			if (needle.charAt(0) == haystack.charAt(i)) {
				flag = true;
				for (int j = 0, k = i; j < needle.length() && k < haystack.length(); j++, k++) {
					if (needle.charAt(j) != haystack.charAt(k)) {
						flag = false;
						sb.setLength(0);
						break;
					} else
						sb.append(haystack.charAt(k));
				}
				if (flag && needle.equals(sb.toString())) {
					return i;
				}
			}
		}
		return -1;
	}
}

class last_28 {
	public static void main(String x[]) {
		String str = "LeetCodeCoede";
		String st = "Code";

		Solution s = new Solution();
		System.out.println(s.strStr(str, st));
	}
}