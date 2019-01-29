package leetCode;

public class LeetCode033 {
	
	public int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int middle = (start + end) >>> 1;
			if (nums[middle] == target) {
				return middle;
			} else if (nums[middle] < nums[end]) {
				if (target <= nums[end] && target > nums[middle]) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			} else {
				if (target >= nums[start] && target < nums[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
		}
		return -1;
	}

}
