package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22h";
		String s3 = "aa6b326c6e22h";

		String[] strings = { s1, s3, s2 };
		String[] s = getLargestNumbers(strings);
		sort(s);
		for (String i : s) {
			System.out.println(i);
		}

	}

	private static String[] getLargestNumbers(String[] stringInputs) {
		String[] largestNumbers = new String[stringInputs.length];
		int countNumber = 0;
		for (String stringInput : stringInputs) {

			int counter = 0;
			boolean prev = true;
			String[] numbers = new String[stringInput.length()];
			StringBuilder currentNumber = new StringBuilder();
			if (stringInput.equals("")) {
				currentNumber.append("0");
			}
			for (int i = 0; i < stringInput.length(); i++) {
				char currentLetter = stringInput.charAt(i);
				if (currentLetter > '0' && currentLetter <= '9') {
					currentNumber.append(currentLetter);
					prev = false;
				} else {
					if (prev) {
						prev = true;
						continue;
					}
					numbers[counter++] = currentNumber.toString();
					currentNumber.delete(0, currentNumber.length());
					prev = true;
				}
			}
			if (!prev)
				numbers[counter++] = currentNumber.toString();
			numbers = Arrays.copyOfRange(numbers, 0, counter);
//			for(String i:numbers) {
//				System.out.println(i);
//			}
//			System.out.println("----------------> " + getMaxNumber(numbers));
			largestNumbers[countNumber++] = getMaxNumber(numbers);
		}

		return largestNumbers;
	}

	private static String getMaxNumber(String[] input) {
		int max = Integer.parseInt(input[0]);
		for (String i : input) {
			if (Integer.parseInt(i) >= max)
				max = Integer.parseInt(i);
		}
		return String.valueOf(max);
	}

	private static void sort(String[] input) {
		int[] numbers = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}

		int temp;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}

		for (int i = 0; i < input.length; i++) {
			input[i] = String.valueOf(numbers[i]);
		}
	}

}
