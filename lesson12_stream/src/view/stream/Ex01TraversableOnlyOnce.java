package view.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01TraversableOnlyOnce {

		public static void main(String[] args) {
			int num = 45;
			if (isHappyNumber(num)) {
				System.out.println(num + " la so hanh phuc");
			}else {
				System.out.println(num + " khong phai la so hanh phuc");
			}
		}

		public static boolean isHappyNumber(int number) {
		    int sum = number;
		    Set<Integer> seen = new HashSet<>();

		    while (sum != 1) {
		        int current = sum;
		        int digitSum = 0;

		        while (current != 0) {
		            int digit = current % 10;
		            digitSum += digit * digit;
		            current /= 10;
		        }

		        if (seen.contains(digitSum)) {
		            return false; 
		        }

		        seen.add(digitSum);
		        sum = digitSum;
		    }

		    return true; 
		}

}
