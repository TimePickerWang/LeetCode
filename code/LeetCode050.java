package leetCode;

public class LeetCode050 {

	public double myPow(double x, int n) {
		double result = 1;
		for (int i = n; i != 0; i /= 2) {
			if ((i & 1) != 0) { // 奇数
				result *= x;
			}
			x *= x;
		}
		return n > 0 ? result : 1 / result;
	}

}
