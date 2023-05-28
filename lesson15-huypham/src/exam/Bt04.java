package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Bt04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.println(findCharacter(str));
        
	}
	
	private static List<Character> findCharacter(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();
		List<Character> resultList = new ArrayList<>();

		Map<Character, Integer> wordFrequency = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (wordFrequency.containsKey(c)) {
				wordFrequency.put(c, wordFrequency.get(c) + 1);
			}else {
				wordFrequency.put(c, 1);
			}
		}
		int max = 0;

		for (int value : wordFrequency.values()) {
			if (value > max) 
				max = value;
		}
		
		for (Map.Entry<Character, Integer> entry : wordFrequency.entrySet()) {
			 if (entry.getValue() == max) {
				char key = entry.getKey();
	            resultList.add(key);
	         }
		}
		
		return resultList;
	}
}
