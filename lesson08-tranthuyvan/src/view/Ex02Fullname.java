package view;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu sau:
 * Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
 * Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
 * Các kí tự cách nhau một khoảng trắng
 * Example : aDam Le vAN john Son => Adam Le Van John Son
 * Anne frAnk => Anne Frank
 */

public class Ex02Fullname {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fullname = "";
		do {
			try {
				System.out.print("Input your fullname: ");
				fullname = sc.nextLine();
				if (isValidName(fullname)) {
					System.out.println("Fullname with standard format --> " + capitalizeFirstChar(fullname));
					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		sc.close();
	}

	private static boolean isValidName(String name) throws Exception {
		if (!Pattern.matches("[a-zA-Z\\s]+", name)) {
			throw new Exception("Name must contains uppercase, lowercase characters & space!!!");
		}
		return true;
	}

	private static String capitalizeFirstChar(String name) {
		String result = "";
		name = name.trim().toLowerCase();
		name = name.replaceAll("[\\s]+", " ");
		String[] words = name.split("\\s");
		for (int i = 0; i < words.length; i++) {
			result = result + String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
			if (i <= words.length - 1) {
				result = result + " ";
			}
		}
		return result;

	}

}
