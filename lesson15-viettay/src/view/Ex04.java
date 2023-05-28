package view;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Scanner;

/**
Bài 4: Viết chương trình tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
Input: Chuỗi gồm các kí tự [a-zA-Z]
		Example: aaaababbbddc Output: “a”
				 aaaccdcee Output: “a”, “c”
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = ip.nextLine();
		result(s);
	}

	private static void result(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		OptionalInt max = map.entrySet().stream().mapToInt(Map.Entry::getValue).max();
		if (max.isPresent()) {
			int maxValue = max.getAsInt();
			map.forEach((key, value) -> {
				if (value == maxValue) {
					System.out.print(key + " ");
				}
			});
		}
	}
}
