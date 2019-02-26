package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode022 {
	public static List<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<String>();
		generateParenthesisCore(result, "", 0, 0, n);
		return result;
	}

	public static void generateParenthesisCore(List<String> list, String str, int left, int right, int n) {
		if (left == right && left == n) {
			list.add(str);
			return;
		}
		if (left < n) {
			generateParenthesisCore(list, str + "(", left + 1, right, n);
		}
		if (right < left) {
			generateParenthesisCore(list, str + ")", left, right + 1, n);
		}
	}

}
