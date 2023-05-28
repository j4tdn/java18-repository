package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("nhập chuỗi: ");
		String s = ip.nextLine();
		
		char[] cs = WordMostAppear(s);
		
		System.out.println("các ký tự xuất hiện nhiều lần: ");
	
		for(char c : cs) {
			System.out.println(c);
		}
	}
	
	private static char[] WordMostAppear(String s) {
		s = s.toLowerCase();
		Map<Character, Integer> charCount = new HashMap<>();
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		
		char[] cs = new char[s.length()];
		int max = 0;
		int count = 1;
		
		for(Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() >= max) {
				cs[0] = entry.getKey();
				max = entry.getValue();
//				count++;
			}
		}
		
		charCount.remove(cs[0]);
		
		for(Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() == max) {
				cs[count] = entry.getKey();
				max = entry.getValue();
				count++;
			}
		}
		
		char[] result = Arrays.copyOfRange(cs, 0, count);
		return result;
	}
}

