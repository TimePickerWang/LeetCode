package leetCode;

public class LeetCode005 {
	public String longestPalindrome(String s) {
		int beginIndex = 0, endIndes = 0;
		for (int i = 0; i < s.length(); i++) {
			int len = Math.max(getLength(i, i, s), getLength(i, i + 1, s));
			if (len >= endIndes - beginIndex + 1) {
				beginIndex = i - (len - 1) / 2;
				endIndes = i + len / 2 + 1;
			}
		}
		return s.substring(beginIndex, endIndes);
	}

	public int getLength(int left, int right, String s) {
		int l = left, r = right;
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		return r - l - 1;
	}

	public static void main(String[] args) {
		String str = "a";
		System.out.println(new LeetCode005().longestPalindrome(str));
	}
}
