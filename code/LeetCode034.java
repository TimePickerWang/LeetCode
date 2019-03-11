package leetCode;

public class LeetCode034 {
	public int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };
		int leftIndex = find(nums, target, true);
		if (leftIndex == nums.length || nums[leftIndex] != target) { // 没找到目标数
			return result;
		} else { // 找到最左位置
			result[0] = leftIndex;
			result[1] = find(nums, target, false) - 1;
			return result;
		}
	}

	public int find(int[] nums, int target, boolean findLeft) {
		int low = 0, high = nums.length, middle;
		while (low < high) {
			middle = (low + high) >> 1;
			if (nums[middle] > target || (findLeft && nums[middle] == target)) {
				high = middle;
			} else {
				low = middle + 1;
			}
		}
		return low;
	}
	
}
