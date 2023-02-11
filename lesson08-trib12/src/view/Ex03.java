package view;

import java.util.Scanner;
import java.text.Normalizer;
public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi TIẾNG VIỆT có dấu: ");
		String string = ip.nextLine();
		string = Normalizer.normalize(string, Normalizer.Form.NFD);
		System.out.println("Result: " + string.replaceAll("\\p{M}", ""));
	}

}
