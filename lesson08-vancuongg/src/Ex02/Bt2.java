package Ex02;

import java.util.Scanner;

public class Bt2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String chuoi;
		System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
		chuoi = sc.nextLine();

		char[] charArray = chuoi.toCharArray();
		boolean foundSpace = true;

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isLetter(charArray[i])) {

				if (foundSpace) {

					charArray[i] = Character.toUpperCase(charArray[i]);
					foundSpace = false;
				}
			} else {
				foundSpace = true;
			}
		}
		chuoi = String.valueOf(charArray);
		System.out.println("Chuỗi sau khi đổi: \n" + chuoi);

	}
}
