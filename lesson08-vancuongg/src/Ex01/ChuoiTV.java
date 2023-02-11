package Ex01;

import java.util.Scanner;

public class ChuoiTV {
	public static void main(String[] args) {

		String chuoi;
		char KyTu;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào chuỗi bất kỳ: ");
		chuoi = scanner.nextLine();

		System.out.println("Các ký tự có trong chuỗi là: ");
		for (int i = 0; i < chuoi.length(); i++) {

			KyTu = chuoi.charAt(i);

			System.out.println(KyTu);
		}

		System.out.println("2. In ra mỗi từ trên mỗi dòng");
		String[] words = chuoi.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("3. In ra chuỗi đảo ngược theo kí tự");
		for (int i = chuoi.length() - 1; i >= 0; i--) {
			System.out.println(chuoi.charAt(i));
		}
		System.out.println("4. In ra chuỗi đảo ngược theo từ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}
