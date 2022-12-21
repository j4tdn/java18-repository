package view;

/**
 * 12abu02muzk586cyx => sau khi split {12, 2, 586}
 * Uyk892nn1234uxo2 => sau khi split {rỗng, 892, 1234, 2}
 * ==> Chuỗi bắt đầu bằng chữ => sau khi spit sẽ là rỗng, rồi mới tới số tiếp theo
 */

public class Ex03FindMaxValidNumber {
	public static void main(String[] args) {
		String[] tests = { "", "12abu02muzk586cyx", "Uyk892nn1234uxo2" };
		for (String test : tests) {
			System.out.println("Max valid number in '" + test + "' --> " + findMaxValidNumber(test));
		}

	}

	private static int findMaxValidNumber(String s) {
		int count = 0;
		String[] tokens = s.split("[a-zA-Z]+"); // tokens: các phần tử
		int max = Integer.MIN_VALUE;
		for (String token : tokens) {
			if (!token.isEmpty()) { // nếu không phải rỗng => vào đây chứng tỏ là số
				Integer validNumber = Integer.parseInt(token);
				if (validNumber > max) {
					max = validNumber;
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("LOG >>> '" + s + "' need at least one digit !!!");
			return 0;
		}

		return max;
	}

}
