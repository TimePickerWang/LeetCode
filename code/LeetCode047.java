package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode047 {
	
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		permuteHelp(0, nums, result);
		return result;
	}

	public void permuteHelp(int index, int[] nums, List<List<Integer>> result) {
		if (index == nums.length) {
			List<Integer> list = new ArrayList<>();
			for (int num : nums) {
				list.add(num);
			}
			result.add(list);
		} else {
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = index; i < nums.length; i++) {
				if (set.add(nums[i])) {
					swap(nums, index, i);
					permuteHelp(index + 1, nums, result);
					swap(nums, i, index);
				}
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
