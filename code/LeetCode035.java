package leetCode;

public class LeetCode035 {
	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1, middle;
		while (low < high) {
			middle = (low + high) >> 1;
			if (nums[middle] == target) {
				return middle;
			} else if (nums[middle] > target) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return nums[low] < target ? low + 1 : low;
	}

}
