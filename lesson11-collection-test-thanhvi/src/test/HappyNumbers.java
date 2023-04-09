package test;

import java.util.*;

public class HappyNumbers {
    public static void main(String[] args) {
        List<Integer> happyNumbers = findHappyNumbers(1, 100);
        System.out.println("Số hạnh phúc (1-100) là: " + happyNumbers);
    }
    
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }
    
    public static List<Integer> findHappyNumbers(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
}
