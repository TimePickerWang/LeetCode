package leetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode297 {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null) {
			return "*,";
		} else {
			return root.val + "," + serialize(root.left) + serialize(root.right);
		}
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] strArray = data.split(",");
		LinkedList<String> list = new LinkedList<>(Arrays.asList(strArray));
		return deserializeHelp(list);
	}

	public TreeNode deserializeHelp(LinkedList<String> queue) {
		String value = queue.pollFirst();
		if (value.equals("*")) {
			return null;
		} else {
			TreeNode node = new TreeNode(Integer.valueOf(value));
			node.left = deserializeHelp(queue);
			node.right = deserializeHelp(queue);
			return node;
		}
	}

}
