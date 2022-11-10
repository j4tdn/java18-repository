package view;

/**
 * Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10 (decimal - thập phân) 
 * thành số ở hệ cơ số 2 (binary - nhị phân)
 * VD: Nhập N = 0 → 0
 * 			N = 1 → 1
 * 			N = 2 → 10
 * 			N = 3 → 11
 * 			N = 4 → 100
 * 			N = 5 → 101
 */

public class Ex07DecimalToBinary {
	public static void main(String[] args) {
		int n = 19;
		System.out.println("Decimal number: " + n);
		System.out.print("Convert to binary number --> ");
		convertDecimalToBinary(n);
	}

	// Function: convert decimal number to binary number
	private static void convertDecimalToBinary(int n) {
		// create an array to store binary number
		int[] binaryNum = new int[50];

		// counter for binary array
		int i = 0;
		while (n > 0) {
			// store remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		// print binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);

	}

}
