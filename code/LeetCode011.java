package leetCode;

public class LeetCode011 {
	public int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = 0, tempArea = 0;
		while (right != left) {
			tempArea = (right - left) * Math.min(height[left], height[right]);
			maxArea = tempArea > maxArea ? tempArea : maxArea;
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

}
