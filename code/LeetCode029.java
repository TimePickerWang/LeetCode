package leetCode;

public class LeetCode029 {
	public int divide(int dividend, int divisor) {
		int sign = 1, result;
		long dividendAbs = Math.abs((long) dividend);
		long divisorAbs = Math.abs((long) divisor);

		if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
			sign = -1;
		}
		if (dividend == 0 || dividendAbs < divisorAbs) {
			return 0;
		}

		long resultTemp = divideHepler(dividendAbs, divisorAbs);
		if (resultTemp > Integer.MAX_VALUE) { // Handle overflow.
			result = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		} else {
			result = (int) (sign > 0 ? resultTemp : -resultTemp);
		}
		return result;
	}

	private long divideHepler(long dividend, long divisor) {
		if (dividend < divisor) {
			return 0;
		}
		long sum = divisor, result = 1;

		while (sum << 1 <= dividend) {
			sum = sum << 1;
			result = result << 1;
		}
		return result + divideHepler(dividend - sum, divisor);
	}

}
