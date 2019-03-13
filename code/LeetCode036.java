package leetCode;

public class LeetCode036 {
	/* 9个box的编号
	 * -------------
	 * | 0 | 1 | 2 |
	 * -------------
	 * | 3 | 4 | 5 |
	 * -------------
	 * | 6 | 7 | 8 |
	 * -------------
	 * */

	public boolean isValidSudoku(char[][] board) {
		boolean[][] rows = new boolean[9][9];
		boolean[][] cols = new boolean[9][9];
		boolean[][] boxs = new boolean[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int number = board[i][j] - 49; // 字符转数字,'5'->4(这里减1为了防止越界)
					int boxIndex = (i / 3) * 3 + j / 3; // 当前box的编号

					if (rows[i][number] || cols[j][number] || boxs[boxIndex][number]) { // 某行/列/box已包含某个数字
						return false;
					} else {
						rows[i][number] = true;
						cols[j][number] = true;
						boxs[boxIndex][number] = true;
					}
				}
			}
		}
		return true;
	}

}
