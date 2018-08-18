package leetCode;

public class LeetCode062 {
	public int uniquePaths(int m, int n) {
		int[][] result = new int[m][n];
		for (int i = 0; i < n; i++) {
			result[0][i] = 1;
		}
		for (int j = 0; j < m; j++) {
			result[j][0] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				result[i][j] = result[i - 1][j] + result[i][j - 1];
			}
		}
		return result[m - 1][n - 1];
	}

	public static void main(String[] args) {
		System.out.println(new LeetCode062().uniquePaths(7, 3));
	}
}
