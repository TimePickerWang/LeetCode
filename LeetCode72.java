package leetCode;

public class LeetCode72 {

	public int minDistance(String word1, String word2) {
		char[] a = word1.toCharArray();
		char[] b = word2.toCharArray();
		int[][] times = new int[a.length + 1][b.length + 1];

		for (int i = 0; i <= a.length; i++) {
			times[i][0] = i;
		}
		for (int j = 0; j <= b.length; j++) {
			times[0][j] = j;
		}

		for (int i = 1; i <= a.length; i++) {
			for (int j = 1; j <= b.length; j++) {

				if (a[i - 1] == b[j - 1]) {
					times[i][j] = times[i - 1][j - 1];
				} else {
					times[i][j] = Math.min(times[i - 1][j - 1] + 1, Math.min(times[i][j - 1] + 1, times[i - 1][j] + 1));
				}
			}
		}
		return times[a.length][b.length];
	}

	public static void main(String[] args) {
		String word1 = "";
		String word2 = "";

		System.out.println(new LeetCode72().minDistance(word1, word2));
	}
}
