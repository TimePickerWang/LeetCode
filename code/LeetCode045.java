package leetCode;

public class LeetCode045 {

	public int jump(int[] nums) {
		int curMax = 0, curLimit = 0, jumpTime = 0;// 探测到的最大范围，当前能到达的边界，最小跳跃次数

		for (int i = 0; i < nums.length - 1; i++) {
			curMax = Math.max(curMax, nums[i] + i);
			if (curMax >= nums.length - 1) {
				return jumpTime + 1;
			} else if (i == curLimit) {
				jumpTime++;
				curLimit = curMax;
			}
		}
		return jumpTime;
	}

}
