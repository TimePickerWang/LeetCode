package leetCode;

public class LeetCode002 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return l1 == null ? l2 : l1;
		}
		int sum = l1.val + l2.val;
		ListNode node = new ListNode(sum % 10);
		node.next = addTwoNumbers(l1.next, l2.next);
		if (sum >= 10) {
			node.next = addTwoNumbers(new ListNode(sum / 10), node.next);
		}
		return node;
	}
}
