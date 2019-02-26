package leetCode;

import java.util.Arrays;

public class LeetCode016 {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int dist = Integer.MAX_VALUE;
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum < target) {
					left++;
				} else if (sum > target) {
					right--;
				} else {
					return sum;
				}
				if (Math.abs(sum - target) < dist) {
					dist = Math.abs(sum - target);
					result = sum;
				}
			}
		}
		return result;
	}

}
