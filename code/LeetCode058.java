package leetCode;

public class LeetCode058 {

	public static int lengthOfLastWord(String s) {
		int lastWordLen = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (lastWordLen > 0 && s.charAt(i) == ' ') {
				return lastWordLen;
			} else if (s.charAt(i) == ' ') {
				continue;
			} else {
				lastWordLen++;
			}
		}
		return lastWordLen;
	}

}
