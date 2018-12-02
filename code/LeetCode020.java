package leetCode;

import java.util.Stack;

public class LeetCode020 {
	public static boolean isCharValid(char key1, char key2) {
		if ((key1 == '(' && key2 == ')') || (key1 == '{' && key2 == '}') || (key1 == '[' && key2 == ']')) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		if (s.length() == 0) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty() || !isCharValid(stack.peek(), s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
	}
}
