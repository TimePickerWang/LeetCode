package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode049 {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		if (strs.length > 0) {
			HashMap<String, List<String>> map = new HashMap<>();
			for (int i = 0; i < strs.length; i++) {
				char[] ithArray = strs[i].toCharArray();
				Arrays.sort(ithArray); // 字符排序
				String ithStr = String.valueOf(ithArray);

				map.putIfAbsent(ithStr, new ArrayList<>());
				map.get(ithStr).add(strs[i]);
			}
			result.addAll(map.values());
		}
		return result;
	}

}
