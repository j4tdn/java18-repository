package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02Demo {
	public static boolean isHappyNumber(int n) {
        Set<Integer> setNums = new HashSet<>();
        while (n != 1 && !setNums.contains(n)) {
        	setNums.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        if(n == 1) {
        	 return true;
        }
        return false;
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isHappyNumber(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
