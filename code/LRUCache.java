package leetCode;

import java.util.HashMap;

public class LRUCache {

	class Node {
		Node next;
		Node pre;
		int key;
		int value;
	}

	private int capacity;
	private Node first;
	private Node last;
	private HashMap<Integer, Node> caches;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		caches = new HashMap<>(capacity);
	}

	private void removeLast() {
		if (last != null) {
			caches.remove(last.key);
			last = last.pre;
			if (last != null) {
				last.next = null;
			} else {
				first = null;
			}
		}
	}

	private void moveNodeToFirst(Node node) {
		if (node == first || node == null)
			return;
		if (node.pre != null) {
			node.pre.next = node.next;
		}
		if (node.next != null) {
			node.next.pre = node.pre;
		}
		if (node == last) {
			last = last.pre;
		}
		if (last == null || first == null) {
			last = first = node;
		} else {
			node.next = first;
			first.pre = node;
			first = node;
			node.pre = null;
		}
	}

	public void put(int key, int value) {
		Node node = caches.get(key);
		if (node == null) { // key在cache中不存在
			if (capacity == caches.size()) {
				removeLast();
			}
			node = new Node();
			node.key = key;
		}
		node.value = value;
		moveNodeToFirst(node);
		caches.put(key, node);
	}

	public int get(int key) {
		Node node = caches.get(key);
		if (node == null) {
			return -1;
		} else {
			moveNodeToFirst(node);
			return node.value;
		}
	}
}


/*   复杂度不为O(1)的解法
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
	private int capacity;
	private HashMap<Integer, Integer> map = new HashMap<>();
	private LinkedList<Integer> list = new LinkedList<>();

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			list.remove(new Integer(key));
			list.addFirst(key);
			return map.get(key);
		} else {
			return -1;
		}
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			list.remove(new Integer(key));
		} else if (list.size() == capacity) {
			Integer delKey = list.removeLast();
			map.remove(delKey);
		}
		list.addFirst(key);
		map.put(key, value);
	}
}
*/