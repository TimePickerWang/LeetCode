package leetCode;

public class LeetCode007 {
	public int reverse(int x) {
		int absNum = Math.abs(x);
		long result = 0;
		while (absNum > 0) {
			result = result * 10 + absNum % 10;
			absNum /= 10;
		}
		if ((x > 0 && result > Integer.MAX_VALUE) || (x < 0 && result * -1 < Integer.MIN_VALUE)) {
			return 0;
		} else if (x > 0) {
			return (int) result;
		} else {
			return (int) (-1 * result);
		}
	}

	public static void main(String[] args) {
		LeetCode007 l = new LeetCode007();
		System.out.println(l.reverse(-1563847412));
		System.out.println(l.reverse(584650));
		System.out.println(l.reverse(-584650));
	}
}
