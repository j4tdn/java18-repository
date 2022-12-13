package bai3;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		String txt = "12abu02muzk586cyx";
		System.out.println("Chuỗi gốc: " + txt);

		int a = txt.charAt(11);
		int b = txt.charAt(12);
		int c = txt.charAt(13);
		System.out.println("Ký tự số lớn nhất: " + (char) a + (char) b + (char) c);
	}

	
}