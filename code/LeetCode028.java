package leetCode;

public class LeetCode028 {
	public static int strStr(String haystack, String needle) {
		int hLen = haystack.length(), nLen = needle.length();
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == nLen) {
					return i;
				}
				if (i + j == hLen) {
					return -1;
				}
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
	}
}
