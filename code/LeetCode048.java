package leetCode;

public class LeetCode048 {

	public void rotate(int[][] matrix) {
		int dim = matrix.length;
		for (int i = 0; i < dim / 2; i++) {
			int row = dim - i - 1;
			if (i == row) {
				return;
			}
			for (int j = i; j < row; j++) {
				int col = dim - j - 1;
				int temp = matrix[i][j];
				matrix[i][j] = matrix[col][i]; // 左上
				matrix[col][i] = matrix[row][col]; // 左下
				matrix[row][col] = matrix[j][row]; // 右下
				matrix[j][row] = temp; // 右上
			}
		}
	}

}
