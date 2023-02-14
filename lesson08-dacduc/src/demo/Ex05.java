package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input N :");
			int valueN = Integer.parseInt(sc.nextLine());
			System.out.println("Input N :");
			int valueM = Integer.parseInt(sc.nextLine());
			if (valueN < 250 && valueM < 250) {
				System.out.println("Input string1 : ");
				String str1 = sc.nextLine();
				System.out.println("Input string2 : ");
				String str2 = sc.nextLine();
				try {
					if(isValidate(str1, str2)) {
						longestSubstring(str1, str2);
						break; 
					}				
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
			}
			
		} while (true);
	}
	private static boolean isValidate(String valueN, String valueM) throws Exception {
		String regix = "[A-Z\\s]+";
		if (Pattern.matches(regix, valueN) && Pattern.matches(regix, valueM) && valueN.length() < 250
				&& valueM.length() < 250) {
			return true;
		} else {
			throw new Exception("Invalid input string !");
		}
	}
//	private static void longestSubstring(String valueN, String valueM) {
//		String temp = "";
//		String result = "";
//		if(valueN.length() < valueM.length()) {
//			temp = valueN;
//		}
//		else {
//			temp = valueM;
//		}
//		for(int i = 0;i<temp.length();i++) {
//			if(String.valueOf(valueN.charAt(i)).equals(String.valueOf(valueM.charAt(i)))) {
//				result+=String.valueOf(i);
//			}
//		}
//		System.out.println(result);
//		
//	}
	private static void longestSubstring(String valueN, String valueM) {
		String result = "";
		for (int i = 0; i < valueN.length(); i++) {
			for (int j = valueN.length(); j > 0; j--) {
				if (i < valueN.length() - j) {
					String subString = valueN.substring(i, valueN.length() - j);
					if (valueM.indexOf(subString) >= 0) {
						if (subString.length() > result.length()) {
							result = subString;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}
