package view;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
	 public static void main(String[] args) {
	        String input = "aaaababbbddc";

	        Map<Character, Integer> characterCount = new HashMap<>();

	        // Đếm số lần xuất hiện của mỗi ký tự trong chuỗi
	        for (char ch : input.toCharArray()) {
	            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
	        }

	        // Tìm ký tự có số lần xuất hiện nhiều nhất
	        int maxCount = 0;
	        for (int count : characterCount.values()) {
	            if (count > maxCount) {
	                maxCount = count;
	            }
	        }

	        // In ra các ký tự có số lần xuất hiện bằng maxCount
	        System.out.print("Ký tự có số lần xuất hiện nhiều nhất trong chuỗi là: ");
	        for (char ch : characterCount.keySet()) {
	            if (characterCount.get(ch) == maxCount) {
	                System.out.print(ch + " ");
	            }
	        }
	    }
}
