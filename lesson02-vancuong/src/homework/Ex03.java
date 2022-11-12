package homework;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	 int num;
     System.out.print("nhập vào một số: ");
     try (Scanner scanner = new Scanner(System.in)) {
         num = scanner.nextInt();
     }
     long fact = 1;
     if (num != 0 || num != 1) {
         for (int i = 2; i <= num; i++) {
             fact = fact * i;
         }
     }
     System.out.println("giai thừa của "+ num + " là " + fact);
}
}
		

