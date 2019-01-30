package leetCode;

public class LeetCode112 {

	public boolean hasPathSum(TreeNode root, int sum) {
		return find(root, sum, 0);
	}

	public boolean find(TreeNode node, int sum, int curSum) {
		if (node == null) {
			return false;
		}
		curSum += node.val;
		if (node.left == null && node.right == null) { // 叶节点
			return curSum == sum;
		} else {
			return find(node.left, sum, curSum) || find(node.right, sum, curSum);
		}
	}
}
