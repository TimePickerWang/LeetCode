package leetCode;

public class LeetCode042 {

	public int trap(int[] height) {
		int result = 0;
		int leftMax = 0, rightMax = 0;
		int leftIndex = 0, rightIndex = height.length - 1;

		while (leftIndex < rightIndex) {
			if (height[leftIndex] < height[rightIndex]) {
				if (height[leftIndex] > leftMax) {
					leftMax = height[leftIndex];
				} else {
					result += leftMax - height[leftIndex];
				}
				leftIndex++;
			} else {
				if (height[rightIndex] > rightMax) {
					rightMax = height[rightIndex];
				} else {
					result += rightMax - height[rightIndex];
				}
				rightIndex--;
			}
		}
		return result;
	}

}
