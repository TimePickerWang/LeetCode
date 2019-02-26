package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode001 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int subRes = target - nums[i];
			if (map.containsKey(subRes)) {
				result[0] = map.get(subRes);
				result[1] = i;
			} else {
				map.put(nums[i], i);
			}
		}
		return result;
	}
}
