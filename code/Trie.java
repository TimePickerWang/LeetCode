package leetCode;

import java.util.HashMap;

public class Trie {

	private TrieNode root;

	class TrieNode {
		private HashMap<Character, TrieNode> nodeMap;
		private boolean isEnd; // 是否是一个结束节点

		public TrieNode() {
			nodeMap = new HashMap<>();
		}

		public TrieNode get(char ch) {
			return nodeMap.get(ch);
		}

		public void put(char ch, TrieNode node) {
			nodeMap.put(ch, node);
		}

		public boolean isEnd() {
			return isEnd;
		}

		public void setEnd() {
			this.isEnd = true;
		}
	}

	/** Initialize your data structure here. */
	public Trie() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.get(ch) == null) {
				node.put(ch, new TrieNode());
			}
			node = node.get(ch);
		}
		node.setEnd();
	}

	public TrieNode searchPrefix(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.get(ch) == null) {
				return null;
			}
			node = node.get(ch);
		}
		return node;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		TrieNode node = searchPrefix(word);
		return node != null && node.isEnd();
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		return searchPrefix(prefix) != null;
	}

}
