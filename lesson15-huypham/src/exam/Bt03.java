package exam;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Bt03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
		boolean stt = checkAnagram(str1, str2);

		if (stt) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	private static boolean checkAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Integer> wordFrequency = new HashMap<>();
		for (char c : str1.toCharArray()) {
			if (wordFrequency.containsKey(c)) {
				wordFrequency.put(c, wordFrequency.get(c) + 1);
			}else {
				wordFrequency.put(c, 1);
			}
		}

		for (char c : str2.toCharArray()) {
			if (!wordFrequency.containsKey(c) || wordFrequency.get(c) == 0) {
				return false;
			}
			wordFrequency.put(c, wordFrequency.get(c) - 1);
		}
		
		for (int value : wordFrequency.values()) {
		    if(value != 0)
		    	return false;
		}
		return true;
	}
}
