package view;

import java.util.Scanner;

import utils.InputUtils;

/**
 * 
 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay
 * không Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại
 * nếu N không hợp lệ (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 * VD: Nhập N = abc -> báo lỗi, yêu cầu nhập lại = 4 -> true = 6 -> false = 8 ->
 * true = 9 -> false
 *
 */
public class Ex02ExponentialOfTwo {

	public static void main(String[] args) {
		int number = InputUtils.input("Enter N(N > 0)", 3);
		String s = "";
		if (isPower(number, 5)) {
			s = number + " is exponential of 5";
		} else {
			s = number + " isn't exponential of 5";
		}
		System.out.println(s);

	}

//	private static boolean isExpOf2(int num) {
//		if (num == 0) {
//			return false;
//		}
//		while (num != 1) {
//			if (num % 2 != 0) {
//				return false;
//			}
//			num = num / 2;
//		}
//		return true;
//	}
	// logab = c => b = a^c
	
	private static boolean isPower(int power, int number) {
		double result = Math.log(power) / Math.log(number);
		System.out.println("result --> " + result);
		System.out.println("round up --> " + Math.ceil(result));
		System.out.println("round down --> " + Math.floor(result));
		return Math.ceil(result) == Math.floor(result);
	}

}
