package leetCode;

public class LeetCode124 {
	int maxSum = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		nodeMaxSum(root);
		return maxSum;
	}

	// 计算以某一节点为根的最大路径和
	public int nodeMaxSum(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int left = Math.max(0, nodeMaxSum(node.left));
			int right = Math.max(0, nodeMaxSum(node.right));
			maxSum = Math.max(maxSum, left + right + node.val);
			return Math.max(left, right) + node.val; // 如果左右子节点路径和都为负数则返回该节点的值，否则返回将该节点加入到路径后的路径和
		}
	}

}
