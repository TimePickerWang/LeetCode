package leetCode;

public class LeetCode206 {
	public ListNode reverseList(ListNode head) {
		ListNode curNode = head;
		ListNode preNode = null;
		ListNode nextNode = null;
		while (curNode != null) {
			nextNode = curNode.next;
			curNode.next = preNode;
			preNode = curNode;
			curNode = nextNode;
		}
		return preNode;
	}
}
