package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode015 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int sum = 0 - nums[i];
				int left = i + 1, right = nums.length - 1;
				while (left < right) {
					if (nums[left] + nums[right] == sum) {
						list.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}
						left++;
						right--;
					} else if (nums[left] + nums[right] < sum) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return list;
	}

}
