package view;

import java.util.Scanner;

/**
 * 
 * 	Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ
	cơ số 2(nhị phân)
	Tham khảo công thức: https://bit.ly/3QuVyXx
	VD: Nhập 	N = 0 -> 0 // note
				N = 1 -> 1
				N = 2 -> 10
				N = 3 -> 11
				N = 4 -> 100
				N = 5 -> 101
 *
 *	
 */
public class Ex07DecimalToBinary {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Enter N: ");
		int number = ip.nextInt();
		convertDecimalToBinary(number);
	}

	private static void convertDecimalToBinary(int n) {
		int original = n;
		int[] binaryNum = new int[100];
		int i = 0;
		if (n == 0) {
			System.out.print(n + "(10) -> " + n + "(2) is 0");
			System.exit(0);
		}
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.print(original + "(10) -> " + original + "(2) is ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNum[j]);
		}
	}
}
