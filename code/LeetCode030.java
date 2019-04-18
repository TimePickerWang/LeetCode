package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode030 {

	public List<Integer> findSubstring(String s, String[] words) {
		ArrayList<Integer> result = new ArrayList<>();
		if (s.trim().length() == 0 || words.length == 0) {
			return result;
		} else {
			int wordNum = words.length;
			int wordLen = words[0].length();
			HashMap<String, Integer> counts = new HashMap<>();
			for (String str : words) {
				counts.put(str, counts.getOrDefault(str, 0) + 1);
			}
			for (int i = 0; i <= s.length() - wordNum * wordLen; i++) {
				HashMap<String, Integer> tempCount = new HashMap<>(counts);
				for (int j = 0; j < wordNum; j++) {
					String tempStr = s.substring(i + j * wordLen, i + (j + 1) * wordLen); // 下一个单词
					if (tempCount.containsKey(tempStr)) {
						int count = tempCount.get(tempStr);
						if (count == 1) {
							tempCount.remove(tempStr);
						} else {
							tempCount.put(tempStr, count - 1);
						}
						if (tempCount.isEmpty()) {
							result.add(i);
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		return result;
	}

}
