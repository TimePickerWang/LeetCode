package leetCode;

public class LeetCode141 {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode slowNode = head;
		ListNode quickNode = head;
		while (quickNode.next != null && quickNode.next.next != null) {
			slowNode = slowNode.next;
			quickNode = quickNode.next.next;
			if (slowNode == quickNode) {
				return true;
			}
		}
		return false;
	}
}
