package leetCode;

public class LeetCode055 {
	public boolean canJump(int[] nums) {
		int numLen = nums.length;
		boolean[] canJump = new boolean[numLen];
		canJump[numLen - 1] = true;
		for (int i = numLen - 2; i >= 0; i--) {
			int stepLength = Math.min(i + nums[i], numLen - 1);
			for (int j = i + 1; j <= stepLength; j++) {
				if (canJump[j] == true) {
					canJump[i] = true;
					break;
				}
			}
		}
		return canJump[0] == true;
	}

	public boolean canJumpGreedy(int[] nums) {
		int lastPos = nums.length - 1;
		for (int i = lastPos - 1; i >= 0; i--) {
			if (i + nums[i] >= lastPos) {
				lastPos = i;
			}
		}
		return lastPos == 0;
	}

}
