package leetCode;

public class LeetCode198 {
	public static int[] result;

	public int slove(int idx, int[] nums) {
		if (idx < 0) {
			return 0;
		}
		if (result[idx] >= 0) {
			return result[idx];
		}
		result[idx] = Math.max(nums[idx] + slove(idx - 2, nums), slove(idx - 1, nums));
		return result[idx];
	}

	public int rob(int[] nums) {
		result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = -1;
		}
		return slove(nums.length - 1, nums);
	}

}
