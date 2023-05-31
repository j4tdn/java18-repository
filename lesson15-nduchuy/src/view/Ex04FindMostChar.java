package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Ex04FindMostChar {
	public static void main(String[] args) {
		String input1 = "aaaababbbddc";
		String input2 = "aaaccdcee";
		findMostFrequentCharacters(input1);
	}

	public static void findMostFrequentCharacters(String input) {
		char[] charArr = input.toCharArray();
		Map<Character, Integer> frequentChar = countChar(charArr);
//		int maxCount = 0;
//		for (int count : frequentChar.values()) {
//			if (count > maxCount) {
//				maxCount = count;
//			}
//		}
//		// Tạo một map mới chứa các kí tự có số lần xuất hiện bằng maxCount
//        Map<Character, Integer> result = new HashMap<>();
//        for (Map.Entry<Character, Integer> entry : frequentChar.entrySet()) {
//            if (entry.getValue() == maxCount) {
//                result.put(entry.getKey(), entry.getValue());
//            }
//        }
		// Tìm số lần xuất hiện nhiều nhất
		int maxCount = frequentChar.values().stream().mapToInt(Integer::intValue).max().orElse(0);

		// Lấy Map chứa các phần tử có số lần xuất hiện bằng maxCount từ charCounts
		Map<Character, Integer> result = frequentChar.entrySet().stream().filter(entry -> entry.getValue() == maxCount)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		printf(result);
	}

	public static Map<Character, Integer> countChar(char[] charArr) {
		Map<Character, Integer> charCounts = new HashMap<>();
		for (char element : charArr) {
			charCounts.put(element, charCounts.getOrDefault(element, 0) + 1);
		}
		return charCounts;
	}

	public static void printf(Map<Character, Integer> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "--> " + entry.getValue());
		}
	}
}
