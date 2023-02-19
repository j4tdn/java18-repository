package exam;

import java.util.HashSet;
import java.util.Scanner;

public class ExamBT02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashSet<Integer> seen = new HashSet<Integer>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        
		if (n == 1 ) {
	        System.out.println("Đây là số hạnh phúc");
	    } else {
	    	System.out.println("Đây kh phải là số hạnh phúc");
	    }
	}
}
