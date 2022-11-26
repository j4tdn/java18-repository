package horsesaddle;

/**
 * Bài4:Bài toán phần tử yên ngựa
		Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij
		được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là
		phần tử lớn nhất trong cột của nó.
		47 47 36
		23 43 31
		46 7 29
		Theo ví dụ trong bảng số sau đây thì phần tử A02 chính là phần tử yên ngựa.
		Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm tra xem nó có
		phần tử yên ngựa hay không?
 */
import java.util.Random;
import java.util.Scanner;

public class ElementHorseSaddle {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Enter row of array: ");
		int row = ip.nextInt();
		System.out.print("Enter col of array: ");
		int col = ip.nextInt();
		int[][] arr = inputArr(row, col);
		showArr(arr, row, col);
		if (checkHorseSaddle(arr, row, col)) {
			System.out.println("Có phần tử yên ngựa");
		} else {
			System.out.println("Không có phần tử yên ngựa");
		}

	}

	private static int[][] inputArr(int row, int col) {
		Random rd = new Random();
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = 1 + rd.nextInt(99);
			}
		}
		return arr;
	}

	private static void showArr(int arr[][], int row, int col) {
		System.out.println("\nArray after random: \n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	private static boolean checkHorseSaddle(int[][] arr, int row, int col) {
		int temp = 0, count = 0;
		for (int i = 0; i < row; i++) {
			int minRow = arr[i][0];
			for (int j = 0; j < col; j++) {
				if (minRow > arr[i][j]) {
					minRow = arr[i][j];
					temp = j;
				}
			}
			for (int t = 0; t < row; t++) {
				if (minRow < arr[t][temp]) {
					break;
				}
				if (t == row - 1) {
					return true;
				}
			}
		}
		return false;
	}
}
