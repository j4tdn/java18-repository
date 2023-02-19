package kt1;

import java.util.Arrays;
import java.util.Scanner;

/**
 Bài 2: Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
		ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
		nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
		được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
		Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
		Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
		với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
		Method signature: getLargestNumbers(String ...ss) >> String[]
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = Integer.parseInt(ip.nextLine());
		String[] input = new String[n];
		for (int i = 0; i < input.length; i++) {
			System.out.print("Nhập xâu " + (i + 1) + ": ");
			input[i] = ip.nextLine();
		}
		System.out.println(Arrays.toString(getLargestNumbers(input)));
	}

	private static int[] getLargestNumbers(String[] input) {
		int[] rs = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			String[] temp = new String[input[i].length()];
			temp = input[i].split("[a-z]+");
			if (temp[0] == "") {
				temp = Arrays.copyOfRange(temp, 1, temp.length);
			}
			rs[i] = max(temp);
		}
		Arrays.sort(rs);
		return rs;
	}

	private static int max(String[] arr) {
		int[] numbers = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			numbers[i] = Integer.parseInt(arr[i]);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}
