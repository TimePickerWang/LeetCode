package leetCode;

public class LeetCode008 {
	public int myAtoi(String str) {
		str = str.trim(); // 去除首尾空格
		int strLen = str.length();
		int flag = 1;// flag取值为1、-1，代表符号
		int index = 0;
		long res = 0;
		if (strLen == 0) {
			return 0;
		}
		char beginChar = str.charAt(0);
		if (beginChar != '+' && beginChar != '-' && (beginChar < '0' || beginChar > '9')) {
			return 0;
		} else if (beginChar == '+') {
			index += 1;
		} else if (beginChar == '-') {
			flag = -1;
			index += 1;
		}
		for (int i = index; i < strLen; i++) {
			char curChar = str.charAt(i);
			if (curChar >= '0' && curChar <= '9') {
				res = res * 10 + curChar - 48;
				if (flag > 0 && res > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if (flag < 0 && flag * res < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			} else {
				return (int) (flag * res);
			}
		}
		return (int) (flag * res);
	}

	public static void main(String[] args) {
		String str1 = "+-2";
		// String str2 = " -0012a42";
		System.out.println(new LeetCode008().myAtoi(str1));
	}
}
