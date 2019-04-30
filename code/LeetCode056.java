package leetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode056 {

	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 按区间起始大小排序
		LinkedList<int[]> mergedList = new LinkedList<>(); // 用来存储区间合并后的结果
		for (int[] interval : intervals) {
			if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
				mergedList.addLast(interval);
			} else {
				mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
			}
		}
		int[][] result = new int[mergedList.size()][]; // 将链表转为数组
		return mergedList.toArray(result);
	}

}
