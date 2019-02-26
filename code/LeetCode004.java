package leetCode;

public class LeetCode004 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length = nums1.length + nums2.length;
		int[] array = new int[length];
		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				array[k++] = nums1[i++];
			} else {
				array[k++] = nums2[j++];
			}
		}
		while (i < nums1.length) {
			array[k++] = nums1[i++];
		}
		while (j < nums2.length) {
			array[k++] = nums2[j++];
		}
		int middle = length / 2;
		if ((length & 1) == 0) { // 数的个数为偶数
			return (array[middle - 1] + array[middle]) / 2.0;
		} else {// 数的个数为奇数
			return array[middle];
		}
	}
}
