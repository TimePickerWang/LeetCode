package leetCode;

import java.util.HashMap;

public class LeetCode003 {
	public int lengthOfLongestSubstring(String s) {
		int result = 0, start = 0, end = 0;
		int sLen = s.length();
		HashMap<Character, Integer> map = new HashMap<>();// key存字符，value存字符所在的位置
		while (start < sLen && end < sLen) {
			if (map.containsKey(s.charAt(end))) {
				start = Math.max(map.get(s.charAt(end)) + 1, start);// 考虑到回文等情况
			}
			map.put(s.charAt(end), end);
			result = Math.max(result, end - start + 1);
			end++;
		}
		return result;
	}
}
