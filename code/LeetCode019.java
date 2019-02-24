package leetCode;

public class LeetCode019 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode firstNode = head, secondNode = head;// firstNode指向的是倒数第n个节点的前一个节点
		int i = 1;
		while (i < n + 1) {
			if (secondNode.next != null) {
				secondNode = secondNode.next;
				i++;
			} else {// 因为给定的n保证是有效的，根据这点：当遍历完链表还没有到倒数第k个节点时，直接删除头节点并返回
				head = head.next;
				return head;
			}
		}
		while (secondNode.next != null) {
			firstNode = firstNode.next;
			secondNode = secondNode.next;
		}
		firstNode.next = firstNode.next.next;
		return head;
	}
}
