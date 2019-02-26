package leetCode;

public class LeetCode023 {
	public static ListNode mergeKLists(ListNode[] lists) {
		int listNum = lists.length, gap = 1;
		while (gap < listNum) {
			for (int i = 0; i < listNum - gap; i += 2 * gap) {
				lists[i] = mergeTwoLists(lists[i], lists[i + gap]);
			}
			gap *= 2;
		}
		return lists.length > 0 ? lists[0] : null;
	}

	// 两个有序链表的合并
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
