package views;


import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumber {

    public static boolean isHappy(int number) {
        Set<Integer> seen = new HashSet<>();

        while (number != 1) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }

            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            number = sum;
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 44;

        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}

