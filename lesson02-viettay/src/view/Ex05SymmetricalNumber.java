package view;

import java.util.Scanner;

/**
 * 
 * 	Viết chương trình kiểu tra N có phải là số đối xứng hay không
	Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
	VD: Nhập N 	= abc -> báo lỗi, yêu cầu nhập lại
				= a123 -> báo lỗi, yêu cầu nhập lại
				= 1 -> báo lỗi, yêu cầu nhập lại
				= 256 -> false
				= 12525 -> true
				= 2662 -> true
 *
 */
public class Ex05SymmetricalNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = "";
		do {
			System.out.print("Please enter valid N (at least 2 digits): ");
			s = ip.nextLine();
			if (isNumber(s)) {
				break;
			}
			System.out.println("\n==================Error=================\n");
		} while (true);

		int number = Integer.parseInt(s);
		String s1 = "";
		if (isSymmetric(number)) {
			s1 = number + " is symmetrical number";
		} else {
			s1 = number + " isn't symmetrical number";
		}
		System.out.println(s1);

	}

	private static boolean isNumber(String txt) {
		if (txt.length() < 2) {
			return false;
		}
		for (int i = 0; i < txt.length(); i++) {
			char letter = txt.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

	private static boolean isSymmetric(int num) {
		int reversed = 0, original = num;
		// sử dụng vòng lặp while để đảo ngược num
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		// so sánh reversed (số đảo ngược) với original (số ban đầu)
		// nếu bằng thì là số đối xứng
		if (reversed == original) {
			return true;
		}
		return false;
	}

}
