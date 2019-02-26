package leetCode;

public class LeetCode024 {
	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode nextNode = head.next;
		head.next = swapPairs(nextNode.next);
		nextNode.next = head;
		return nextNode;
	}
}
