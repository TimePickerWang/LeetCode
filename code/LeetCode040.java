package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode040 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		findList(candidates, list, new ArrayList<Integer>(), target, 0);
		return list;
	}

	public void findList(int[] nums, List<List<Integer>> list, ArrayList<Integer> subList, int remain, int start) {
		if (remain == 0) {
			list.add(new ArrayList<>(subList));
		} else if (remain < 0) {
			return;
		} else {
			for (int i = start; i < nums.length; i++) {
				if (i > start && nums[i] == nums[i - 1]) {
					continue;
				} else {
					subList.add(nums[i]);
					findList(nums, list, subList, remain - nums[i], i + 1);
					subList.remove(subList.size() - 1);
				}
			}
		}
	}

	public static void main(String[] args) {

	}

}
