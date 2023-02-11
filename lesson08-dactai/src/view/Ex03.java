package view;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter here: ");
		String input = in.nextLine();
		String temp = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{M}");
        input = pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
        System.out.println(input);
	}
}
