package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode039 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		findList(candidates, list, new ArrayList<Integer>(), target, 0);
		return list;
	}

	public void findList(int[] nums, List<List<Integer>> list, List<Integer> subList, int remain, int start) {
		if (remain == 0) {
			list.add(new ArrayList<>(subList));
		} else if (remain < 0) {
			return;
		} else {
			for (int i = start; i < nums.length; i++) {
				subList.add(nums[i]);
				findList(nums, list, subList, remain - nums[i], i); // 不是i+1因为可以取相同的元素
				subList.remove(subList.size() - 1);
			}
		}
	}

}
