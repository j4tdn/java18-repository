package view;
/**
 Bài 2: Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu sau:
		Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
		Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
		Các kí tự cách nhau một khoảng trắng
		Example : aDam Le vAN john Son => Adam Le Van John Son
 */
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String string = "";
		do {
			System.out.print("Nhập vào họ và tên: ");
			string = ip.nextLine();
			if (string.matches("[a-zA-Z ]+")) {
				break;
			} else {
				System.out.println("Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z]!!!");
				System.out.println("==================");
			}
		} while (true);
		String capitalizeWord = "";
		String[] words = string.split("\\s");
		for (String w : words) {
			String rs = "";
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			char[] strArr = afterfirst.toCharArray();
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
					strArr[i] = (char) ((int) strArr[i] + 32);
				}
			}
			for (int i = 0; i < strArr.length; i++) {
				rs += strArr[i];
			}
			capitalizeWord += first.toUpperCase() + rs + " ";
		}
		System.out.println("Result: " + capitalizeWord.trim());
	}
}
