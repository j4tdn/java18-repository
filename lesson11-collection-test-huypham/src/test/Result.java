package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Result {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Input: ");
	     int n = scanner.nextInt();
		 if (isHappy(n)) {
		    System.out.println(n + " --> Happy Number");
		 } else {
		    System.out.println(n + " --> Unhappy Number");
		 }
	}
	public static boolean isHappy(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	    while (!set.contains(n)) {
	        set.add(n);
	        int sum = 0;
		    while (n > 0) {
		        int digit = n % 10;
		        sum += digit * digit;
		        n /= 10;
		    }
		    n = sum;
	        if (n == 1) {
	            return true;
	        }
	    }
	    return false;
	}
	
//	public static int squareSum(int n) {
//	    int sum = 0;
//	    while (n > 0) {
//	        int digit = n % 10;
//	        sum += digit * digit;
//	        n /= 10;
//	    }
//	    return sum;
//	}
}