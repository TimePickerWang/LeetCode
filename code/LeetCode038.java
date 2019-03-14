package leetCode;

public class LeetCode038 {
	public static String countAndSay(int n) {
		String str = "1";
		for (int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1, count = 1; j <= str.length(); j++) {
				if (j == str.length() || str.charAt(j) != str.charAt(j - 1)) {
					sb.append(count);
					sb.append(str.charAt(j - 1));
					count = 1;
				} else {
					count++;
				}
			}
			str = sb.toString();
		}
		return str;
	}

}
