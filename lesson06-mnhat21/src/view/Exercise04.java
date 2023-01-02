package view;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input : ");
		String input = ip.nextLine();
		System.out.println("Read:" + readNumber(input));
	}
	
	private static String preRead(String input) {
		if(input.length() == 1) {
			input = "00" + input;
		}
		else if(input.length() == 2) {
			input = "0" + input;
		}
		return input;
	}
	
	private static String readNumber(String input) {
		String read = "";
		input = preRead(input);
		for(int i = 0; i < input.length(); i++) {
			int num = Character.getNumericValue(input.charAt(i));
			switch(num) {
				case 0 :
					if(i == 0 || i == 2) {
						read += "";
					}
					else if(i == 1 && input.charAt(2) != '0' && input.charAt(0) != '0') {
						read += " lẻ";
					}
					break;
				case 1 :
					if(i == 1) {
						read += " mười";
					}
					else {
						read += " một";
					}
					break;
				case 2 :
					read += " hai";
					break;
				case 3 :
					read += " ba";
					break;
				case 4 :
					read += " bốn";
					break;
				case 5 :
					read += " năm";
					break;
				case 6 :
					read += " sáu";
					break;
				case 7 :
					read += " bảy";
					break;
				case 8 :
					read += " tám";
					break;
				case 9 :
					read += " chín";
					break;
			}
			if(i == 0 && num != 0) {
				read += " trăm";
			}
			if(i == 1) {
				if(num == 0 || num == 1) {
					read += "";
				}

				else {
					read += " mươi";
				}
			}
		}
		return read;
	}
}
