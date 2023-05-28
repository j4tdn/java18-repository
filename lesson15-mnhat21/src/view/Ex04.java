package view;

import java.util.*;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Input String 1 : ");
        String string1 = ip.nextLine();
        HashMap<Character, Integer> counted = convert(string1);

        int maxCount = 0;
        for (int count : counted.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.print("Result: ");
        for (Map.Entry<Character, Integer> entry : counted.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static HashMap<Character, Integer> convert (String input){
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            if (Character.isLetter(ch)) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        return charCountMap;
    }
}
