package Ex03;


 // NHẬP VÀO CHUỖI CÓ DẤU - IN RA CHUỖI KHÔNG DẤU

import java.util.Scanner;
import java.text.Normalizer;

public class Chuyendoitiengviet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input ");
		String string = sc.nextLine();
		string = Normalizer.normalize(string, Normalizer.Form.NFD);
		System.out.println("Output: " + string.replaceAll("\\p{M}", ""));
	}
}