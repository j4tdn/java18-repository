package b4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi ký tự: ");
        String str = scanner.nextLine();

        char mostCommonChar = findMostCommonChar(str);
        System.out.println("Ký tự xuất hiện nhiều nhất trong chuỗi là: " + mostCommonChar);
    }

    public static char findMostCommonChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        char mostCommonChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mostCommonChar = c;
            }
        }

        return mostCommonChar;
    }
}
