package leetCode;

public class LeetCode027 {
	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0 || nums == null) {
			return 0;
		}
		int left = 0, right = nums.length - 1;
		while (left < right) {
			while (left < right && nums[right] == val) {
				right--;
			}
			while (left < right && nums[left] != val) {
				left++;
			}
			if (left < right) {
				nums[left] = nums[right--];
			}
		}
		return nums[0] == val ? 0 : left + 1;
	}

}
