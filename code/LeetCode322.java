package leetCode;

import java.util.Arrays;

public class LeetCode322 {

	public int coinChange(int[] coins, int amount) {
		int max = amount + 1;
		int[] result = new int[max];
		Arrays.fill(result, max);
		result[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					result[i] = Math.min(result[i], result[i - coins[j]] + 1);
				}
			}
		}
		return result[amount] > amount ? -1 : result[amount];
	}

}
