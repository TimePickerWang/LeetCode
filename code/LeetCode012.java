package leetCode;

public class LeetCode012 {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int i = 0;
		while (num != 0) {
			if (num >= numbers[i]) {
				num -= numbers[i];
				sb.append(romans[i]);
			} else {
				i++;
			}
		}
		return sb.toString();
	}

}
