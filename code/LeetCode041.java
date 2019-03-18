package leetCode;

public class LeetCode041 {
	public int firstMissingPositive(int[] nums) {
		int len = nums.length;
		int i = 0;
		// {3, 4, 2, 1} => {1, 2, 3, 4}, 即将[1, len]范围内的数i放在下标是i-1的位置上
		while (i < len) {
			if (nums[i] > 0 && nums[i] <= len && nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
				swap(nums, i, nums[i] - 1);
			} else {
				i++;
			}
		}
		for (i = 0; i < len; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}
		return len + 1;
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
