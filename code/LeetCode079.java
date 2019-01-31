package leetCode;

public class LeetCode079 {
	int m, n; // 矩阵的行数、列数
	boolean[][] visited;
	int[] xStep = { 0, 0, -1, 1 }; // xStep、yStep的同一维表示移动的位置，分别是上、下、左、右
	int[] yStep = { -1, 1, 0, 0 };

	public boolean exist(char[][] board, String word) {
		if (board == null || word == null || board.length == 0) {
			return false;
		}
		if (word.length() == 0) {
			return true;
		}
		m = board.length;
		n = board[0].length;
		visited = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == word.charAt(0)) {
					if (visit(board, i, j, 1, word)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean visit(char[][] board, int x, int y, int wordIndex, String word) {
		if (wordIndex == word.length()) {
			return true;
		}
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int xx = x + xStep[i];
			int yy = y + yStep[i];
			if (xx >= 0 && xx < m && yy >= 0 && yy < n && !visited[xx][yy]
					&& board[xx][yy] == word.charAt(wordIndex)) {
				if (visit(board, xx, yy, wordIndex + 1, word)) {
					return true;
				}
			}
		}
		visited[x][y] = false;
		return false;
	}

}
