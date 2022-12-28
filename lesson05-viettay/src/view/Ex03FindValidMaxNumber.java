package view;

/**
 *  Bài 3: Tìm số tự nhiên hợp lệ lớn nhất trong chuỗi. Biết rằng chuỗi chỉ gồm
	các ký tự số và chữ cái không dấu. Ví dụ
	 12abu02muzk586cyx -> 586
	 Uyk892nn1234uxo2 -> 1234
 *
 */
public class Ex03FindValidMaxNumber {
	public static void main(String[] args) {
		String[] tests = { "", "abc", "abe5gs", "12abu02muzk586cyx", "Uyk892nn1234uxo2" };
		for (String test : tests) {
			System.out.println("Max valid number in '" + test + "' --> " + findMaxValidNumber(test));
		}
	}

	private static int findMaxValidNumber(String s) {
		int count = 0;
		String[] tokens = s.split("[a-zA-Z]+");
		int max = Integer.MIN_VALUE;
		for (String token : tokens) {
			// khi cắt chuổi, nếu như chử cái đứng đầu thì nó sẽ cắt phần thử đầu tiên là
			// rỗng,cuối chuỗi không tính
			if (!token.isEmpty()) {
				Integer validNumber = Integer.parseInt(token);
				if (validNumber > max) {
					max = validNumber;
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("LOG >>> '" + s + "' need at least one digit...");
			return 0;
		}
		return max;
	}

}
