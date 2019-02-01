package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode046 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		permuteHelp(0, nums, result);
		return result;
	}

	public void permuteHelp(int index, int[] nums, List<List<Integer>> result) {
		if (index == nums.length) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				list.add(nums[i]);
			}
			result.add(list);
		} else {
			for (int i = index; i < nums.length; i++) {
				swap(nums, index, i);
				permuteHelp(index + 1, nums, result);
				swap(nums, index, i);
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
