package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode054 {
	public List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		int row = matrix.length;
		if (row == 0) {
			return result;
		}
		int col = matrix[0].length;
		for (int i = 0; 2 * i < col && 2 * i < row; i++) {
			spiralOrderHelper(matrix, result, i, row - i - 1, col - i - 1);
		}
		return result;
	}

	public void spiralOrderHelper(int[][] matrix, List<Integer> list, int start, int rEnd, int cEnd) {
		for (int i = start; i <= cEnd; i++) {// 从左到右打印一行
			list.add(matrix[start][i]);
		}

		if (start < rEnd) {
			for (int i = start + 1; i <= rEnd; i++) {// 从上到下打印一列
				list.add(matrix[i][cEnd]);
			}
		}

		if (start < rEnd && start < cEnd) {// 从右往左打印一行
			for (int i = cEnd - 1; i >= start; i--) {
				list.add(matrix[rEnd][i]);
			}
		}

		if (start + 1 < rEnd && start < cEnd) {// 从下往上打印一列
			for (int i = rEnd - 1; i > start; i--) {
				list.add(matrix[i][start]);
			}
		}
	}

}
