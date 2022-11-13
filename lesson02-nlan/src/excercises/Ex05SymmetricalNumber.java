package excercises;

import java.util.Scanner;

/*Viết chương trình kiểu tra N có phải là số đối xứng hay không
	Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
	VD: Nhập N = abc -> báo lỗi, yêu cầu nhập lại
				= a123 -> báo lỗi, yêu cầu nhập lại
				= 1 -> báo lỗi, yêu cầu nhập lại
				= 256 -> false
				= 1252 -> true
				= 2662 -> true
				*/
public class Ex05SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String n = "";
		System.out.print("Please enter your number: ");
		do {
			n = ip.nextLine();
			if (isNumber(n) && n.length() >=2) {
				break;
			} else {
				System.out.print("Please enter valid interger and at least 2 digits: ");
			}
			
		} while(true);
		int number = Integer.parseInt(n);
		if (isPalindrome(number)) {
			System.out.println("The number " + number + " is palindrome");
		} else {
			System.out.println("The number " + number + " is not palindrome");
		}
	}

	private static boolean isPalindrome(int n) {
		int result =0, temp = n;
		while(temp>0) {
			result = result*10 + temp%10;
			temp = temp/10;
		}
		if (result == n) {
			return true;
		} else {
			return false;
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
