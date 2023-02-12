package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
 * không dấu.
 * Input: Em có yêu anh không anh để anh biết còn chờ
 * 		  Em xin lỗi em đã có thái độ không đúng với anh
 * Output: Em co yeu anh khong de anh biet con cho
 * 	       Em xin loi em da co thai do khong dung voi anh
 */

public class Ex03RemovingAccent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";

		do {
			try {
				System.out.print("Input a valid string: ");
				input = sc.nextLine();
				if (isValidInput(input)) {
					System.out.println("After removing accent --> " + stripAccents(input));
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		sc.close();
	}
	
	private static boolean isValidInput(String input) throws Exception {
		if (!Pattern.matches("[\\p{L}\\s]+", input)) {
			throw new Exception("The string must contain Vietnamese characters with accents and space!!!");
		}
		return true;
	}
	
	private static String stripAccents(String s) 
	{
	    s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}

}
