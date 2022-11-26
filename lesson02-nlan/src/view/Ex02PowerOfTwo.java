package view;

import java.util.Scanner;

/*Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
VD: Nhập N = abc  báo lỗi, yêu cầu nhập lại
= 4 -> true
= 6 -> false
= 8 -> true
= 9 -> false*/

public class Ex02PowerOfTwo {
public static void main(String[] args) {
		
		int wrongTimes = 0;
		
		Scanner ip = new Scanner(System.in);
		String n = "";
		do {
			String suffix = "(" + wrongTimes + "):";
			if (wrongTimes > 0) {
				System.out.print("Please enter valid interger" + suffix);
			} else {
				System.out.print("Please enter your number: ");
			}
			n = ip.nextLine();
			if (isNumber(n)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Wrong times = 5 ../ Exit ...");
				System.exit(0);
			}
		}while(true);
		double number = Double.parseDouble(n);
		System.out.println(Math.log(number)/Math.log(2)+"test");
		int numberCeil = (int) (Math.ceil((Math.log(number)/Math.log(2))));
		int numberFloor = (int) (Math.floor((Math.log(number)/Math.log(2))));
		if (numberCeil == numberFloor) {
			System.out.println(number + " -> true");
		} else {
			System.out.println(number + " -> false");
		}

	}
	
	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}

