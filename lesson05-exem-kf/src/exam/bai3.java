package exam;

import java.util.Arrays;

public class bai3 {
	public static void main(String[] args) {
		String[] test = { "aa6b546c6e22h", "aa6b326c6e22h" };
		String[] result = getLargestNumber(test);
		result = sort(result);
		for (String tmp : result) {
			System.out.println(tmp);
		}
	}

	private static String[] getLargestNumber(String[] strings) {
		String[] result = new String[strings.length];
		int count = 0;
		for (String tmp : strings) {
			int max = 0;
			String number = "";
			int i = 0;
			while (i < tmp.length()) {
				if (tmp.charAt(i) < '0' || tmp.charAt(i) > '9') {
					if (number.length() != 0 && Integer.parseInt(number) > max) {
						max = Integer.parseInt(number);
					}
					number = "";
					i++;
				} else {
					while (i < tmp.length() && tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') {
						number = number + tmp.charAt(i);
						i++;
					}
				}
			}
			result[count++] = Integer.toString(max);
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static String[] sort(String[] strings) {
		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (Integer.parseInt(strings[i]) > Integer.parseInt(strings[j])) {
					String tmp = strings[i];
					strings[i] = strings[j];
					strings[j] = tmp;
				}
			}
		}
		return strings;
	}

}
