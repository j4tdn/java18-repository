package kf;

/**
 * Tìm số tự nhiên hợp lệ lớn nhất trong chuỗi. 
 * Biết rằng chuỗi chỉ gồm các ký tự số và chữ cái không dấu. Ví dụ
 * 12abu02muzk586cyx -> 586
 * Uyk892nn1234uxo2 -> 1234
 * Method signature: int getMaxValidNumber(….)
 */

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		String str = "12abu02muzk586cyx";
		String numberStr = getNumberStr(str);

		int[] array = convert(numberStr);
		System.out.print("\nString -->" + numberStr);

		// print the Integer array
		System.out.print("\nInteger array -->");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// print max value
		System.out.println("\nMax value --> " + getMax(array));

	}

	// check whether input is number or not (c stands for character)
	public static boolean isNumber(char c) {
		return c >= '0' && c <= '9';
	}

	// split number from string
	public static String getNumberStr(String text) {
		String numberStr = "";
		for (int i = 0; i < text.length() - 1; i++) {
			char current = text.charAt(i);
			char next = text.charAt(i + 1);
			if (isNumber(current)) {
				numberStr += current;
			}
			if (isNumber(current) && !isNumber(next)) {
				numberStr += ",";
			}

		}
		return numberStr;
	}

	// Function for conversion
	public static int[] convert(String str) {
		String[] splitArray = str.split(",");
		int[] array = new int[splitArray.length];

		for (int i = 0; i < splitArray.length; i++) {
			array[i] = Integer.parseInt(splitArray[i]);
		}
		return array;
	}

	// Function for filtering maximum value
	public static int getMax(int[] numbers) {
		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}

}
