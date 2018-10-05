package leetCode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode017 {
	public static List<String> letterCombinations(String digits) {
		String[] digitToLetter = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		LinkedList<String> result = new LinkedList<String>();
		if (digits.isEmpty()) {
			return result;
		}

		result.add("");
		for (int i = 0; i < digits.length(); i++) {
			String letters = digitToLetter[digits.charAt(i) - '0'];
			while (result.peek().length() == i) {
				String str = result.pollFirst();
				for (int j = 0; j < letters.length(); j++) {
					result.offerLast(str + letters.charAt(j));
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String digits = "23";
		List<String> strList = letterCombinations(digits);
		for (String string : strList) {
			System.out.println(string);
		}
	}
}
