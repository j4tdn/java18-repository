package exercise;

import java.awt.print.Printable;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Nhập xâu S: ");
	    String S = input.nextLine();
	    int n = S.length();

	    int maxLength = 1;
	    int minLength = n;
	    int currentLength = 1;
	    for (int i = 0; i < n - 1; i++) {
	      if (S.charAt(i) == S.charAt(i + 1)) {
	        currentLength++;
	      } else {
	        maxLength = Math.max(maxLength, currentLength);
	        System.out.println(maxLength);
	        minLength = Math.min(minLength, currentLength);
	        currentLength = 1;
	      }
	    }
	    maxLength = Math.max(maxLength, currentLength);
	    minLength = Math.min(minLength, currentLength);

	    System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
	    System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
	  }
}
