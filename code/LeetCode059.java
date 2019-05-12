package leetCode;

public class LeetCode059 {

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int i = 0, j;
		int num = 1, maxNum = n * n;
		while (num <= maxNum) {
			for (j = i; j < n - i; j++) {
				result[i][j] = num++;
			}
			for (j = i + 1; j < n - i; j++) {
				result[j][n - i - 1] = num++;
			}
			for (j = n - i - 2; j >= i; j--) {
				result[n - i - 1][j] = num++;
			}
			for (j = n - i - 2; j > i; j--) {
				result[j][i] = num++;
			}
			i++;
		}
		return result;
	}

}
