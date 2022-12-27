package view;

public class Ex03FindvalidMaxNumber {
	public static void main(String[] args) {
		// 12abu02muzk586cyx --> sau khi split 12, 2, 586
		// Uyk892nn1234uxo2 --> sau khi split rỗng,892, 1234, 2

		String[] tests = { "", "12abu02muzk586cyx", "Uyk892nn1234uxo2" };
		for (String test : tests) {
			System.out.println("Max valid number in '" + test + "' --> " + findMaxvalidNumber(test));
		}
	}
	// String s = "a,b,c,d";
	// String[] sArray = s.split("[,.]+");

	private static int findMaxvalidNumber(String s) {
		int count = 0;
		String[] tokens = s.split("a-zA-Z]+"); // tokens: các phần tử
		int max = Integer.MIN_VALUE;
		for (String token : tokens) {
			if (!token.isEmpty()) { // nếu không phải rỗng ==> vào đây chứng tỏ là số
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
