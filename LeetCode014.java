package leetCode;

public class LeetCode014 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		} else {
			for (int i = 0; i < strs[0].length(); i++) {
				char tempCh = strs[0].charAt(i);
				for (int j = 1; j < strs.length; j++) {
					if (strs[j].length() - 1 < i || strs[j].charAt(i) != tempCh) {
						return strs[0].substring(0, i);
					}
				}
			}
			return strs[0];
		}
	}

	public static void main(String[] args) {
		String[] strs = { "abab", "aba", "" };
		// String[] strs = { "aa", "a" };
		System.out.println(new LeetCode014().longestCommonPrefix(strs));
	}
}
