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

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		ListNode node = removeNthFromEnd(a, 1);
		while (node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
	}
}
