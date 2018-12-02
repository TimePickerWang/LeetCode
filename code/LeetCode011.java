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

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(new LeetCode011().maxArea(height));
	}
}
