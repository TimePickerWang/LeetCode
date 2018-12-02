package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode018 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		ArrayList<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int left = j + 1, right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (target == sum) {
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						while (left < right && nums[left + 1] == nums[left]) {
							left++;
						}
						while (left < right && nums[right - 1] == nums[right]) {
							right--;
						}
						left++;
						right--;
					} else if (target > sum) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// int[] nums = { 1, 0, -1, 0, -2, 2 };
		int[] nums = { 0, 0, 0, 0 };
		int target = 0;
		System.out.println(fourSum(nums, target));
	}
}
