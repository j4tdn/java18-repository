package view;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
	public static void main(String[] args) {
		String str = "aaaababbbbddc";

		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		int maxCount = 0;
		for (int count : map.values()) {
			maxCount = Math.max(maxCount, count);
		}

		StringBuilder sb = new StringBuilder();
		for (char c : map.keySet()) {
			if (map.get(c) == maxCount) {
				sb.append(c).append(", ");
			}
		}
		System.out.println(sb.substring(0, sb.length() - 2));
	}
}
