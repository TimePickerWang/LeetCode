package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode094 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			list.add(root.val);
			root = root.right;
		}
		return list;
	}

}
