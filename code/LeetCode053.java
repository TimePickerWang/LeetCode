package leetCode;

public class LeetCode053 {
	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0], curSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			curSum = nums[i] + (curSum > 0 ? curSum : 0);
			maxSum = Math.max(curSum, maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(array));
	}
}
