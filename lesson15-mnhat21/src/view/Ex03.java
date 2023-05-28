package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Input String 1 : ");
        String string1 = ip.nextLine();
        System.out.println("Input String 2 : ");
        String string2 = ip.nextLine();
        System.out.println(check(string1, string2));
    }

    private static boolean check (String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }
        Map<Character, Integer> count = new HashMap<>();
        for (char c : string1.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // So sánh số lần xuất hiện của mỗi kí tự trong str2 với bộ đếm của str1
        for (char c : string2.toCharArray()) {
            if (!count.containsKey(c) || count.get(c) == 0) {
                return false;
            }
            count.put(c, count.get(c) - 1);
        }

        return true;
    }
}
