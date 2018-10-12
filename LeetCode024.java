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

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;

		ListNode node = swapPairs(a);
		while (node != null) {
			System.out.println(node.val + "->");
			node = node.next;
		}
	}
}
