package leetCode;

public class LeetCode010 {
	public boolean isMatch(String s, String p) {
		if (s == null || p == null) {
			return false;
		} else if (s.length() == 0 && p.length() == 0) {
			return true;
		} else {
			char[] sArray = s.toCharArray();
			char[] pArray = p.toCharArray();
			return isMatchCore(sArray, pArray, 0, 0);
		}
	}

	public boolean isMatchCore(char[] s, char[] p, int sIndex, int pIndex) {
		if (sIndex == s.length && pIndex == p.length) {
			return true;
		}
		if (sIndex != s.length && pIndex >= p.length) {
			return false;
		}
		if (pIndex + 1 < p.length && p[pIndex + 1] == '*') {
			if (sIndex < s.length && (s[sIndex] == p[pIndex] || p[pIndex] == '.')) {
				return isMatchCore(s, p, sIndex + 1, pIndex) || isMatchCore(s, p, sIndex, pIndex + 2);
			} else {
				return isMatchCore(s, p, sIndex, pIndex + 2);
			}
		} else if (sIndex < s.length && pIndex < p.length && (s[sIndex] == p[pIndex] || p[pIndex] == '.')) {
			return isMatchCore(s, p, ++sIndex, ++pIndex);
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "bbbba";
		String p = ".*a*a";
		System.out.println(new LeetCode010().isMatch(s, p));
	}
}
