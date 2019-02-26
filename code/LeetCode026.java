package leetCode;

public class LeetCode026 {
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[index]) {
				nums[++index] = nums[i];
			}
		}
		return index + 1;
	}

}
