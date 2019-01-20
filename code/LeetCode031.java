package leetCode;

import java.util.Arrays;

public class LeetCode031 {

	public void nextPermutation(int[] nums) {
		int len = nums.length;
		int i = len - 2;
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}
		if (i >= 0) {
			int j = len - 1;
			while (j >= 0 && nums[j] <= nums[i]) {
				j--;
			}
			swap(nums, i, j);
		}
		reverse(nums, i + 1);
	}

	// 反转数组中从start开始到结束的元素
	public void reverse(int[] nums, int start) {
		int end = nums.length - 1;
		while (start < end) {
			swap(nums, start++, end--);
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
