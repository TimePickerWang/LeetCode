package leetCode;

import java.util.PriorityQueue;

//LeetCode295

public class MedianFinder {
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;

	public MedianFinder() {
		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
	}

	public void addNum(int num) {
		if ((minHeap.size() + maxHeap.size() & 1) == 0) { // 总数为偶数
			if (minHeap.size() > 0 && num > minHeap.peek()) {
				minHeap.offer(num);
				num = minHeap.poll();
			}
			maxHeap.offer(num);
		} else {
			if (maxHeap.size() > 0 && num < maxHeap.peek()) {
				maxHeap.offer(num);
				num = maxHeap.poll();
			}
			minHeap.offer(num);
		}
	}

	public double findMedian() {
		boolean flag = ((minHeap.size() + maxHeap.size()) & 1) == 1; // 总数为奇数
		return flag ? maxHeap.peek() : (double) (minHeap.peek() + maxHeap.peek()) / 2;
	}
}
