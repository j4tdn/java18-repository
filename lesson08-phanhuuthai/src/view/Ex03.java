package view;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhập chuỗi có dấu: ");
		String s = ip.nextLine();
		
		s = Normalizer.normalize(s, Normalizer.Form.NFD);
		System.out.println("Chuỗi không dấu: " + s.replaceAll("\\p{M}", ""));
	}
}
