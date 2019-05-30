package leetCode;

public class LeetCode061 {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || k == 0) {
			return head;
		} else {
			int len = 1;
			ListNode curNode = head, tailNode = head;
			while (curNode.next != null) { // 求链表长度
				len++;
				curNode = curNode.next;
			}
			curNode.next = head;// 并将链表连成环
			for (int i = 0; i < len - k % len - 1; i++) {// 找到新的链表尾节点
				tailNode = tailNode.next;
			}
			head = tailNode.next;// 新链表头节点
			tailNode.next = null;
			return head;
		}
	}

}
