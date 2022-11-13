package excercises;

import java.util.Scanner;

	/* Viết chương trình tìm giai thừa của một số nguyên dương N
	Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
	Ví dụ: Nhập N = 1 -> 1! = 1
	Nhập N = 5 -> 5! = 5.4.3.2.1 = 120
	 */
public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String n ="";
		
		System.out.print("Enter n: ");
		n = ip.nextLine();
		int number = Integer.parseInt(n);
		
		int factorial = 1;
		if (number==0 || number==1) {
			factorial =1;
		} else {
			for(int i =2; i<= number; i++) {
				factorial *=i;
			}
		}
		System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
