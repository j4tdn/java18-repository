package view;

import java.util.Arrays;

public class Ex02MaxNumberInStringChain {
	public static void main(String[] args) {
		String input = "abc132495def56ghij7klmno";
		System.out.println(findLargestNumber(input));
	}
	public static String findLargestNumber(String str) {
	    // Tách chuỗi thành các chuỗi con chỉ chứa số
	    String[] numbers = str.split("[^0-9]+");

	    // Tìm chuỗi số lớn nhất
	    String largestNumber = "";
	    for (String number : numbers) {
	        if (number.length() > largestNumber.length() || 
	            (number.length() == largestNumber.length() && number.compareTo(largestNumber) > 0)) {
	            largestNumber = number;
	        }
	    }
	    largestNumber = arrange(largestNumber);
	    return largestNumber;
	}
	public static String arrange(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sortedString = new String(chars);
		return sortedString;
	}
}
