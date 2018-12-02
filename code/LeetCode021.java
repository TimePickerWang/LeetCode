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

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(4);
		a1.next = a2;
		a2.next = a3;
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(4);
		b1.next = b2;
		b2.next = b3;
		ListNode head = mergeTwoLists(a1, b1);
		while (head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
	}
}
