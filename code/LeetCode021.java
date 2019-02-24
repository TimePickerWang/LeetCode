package leetCode;

public class LeetCode021 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0), curNode = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				curNode.next = l1;
				l1 = l1.next;
			} else {
				curNode.next = l2;
				l2 = l2.next;
			}
			curNode = curNode.next;
		}
		if (l1 != null) {
			curNode.next = l1;
		} else {
			curNode.next = l2;
		}
		return head.next;
	}
}
