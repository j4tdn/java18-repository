package exercise03;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		int[] A = { 5, 2, 3, 4, 5, 9, 6, 1, 4, 2 };
		int[] B = { 5, 9, 3, 4};

		System.out.println(getLeastCommonMultiple(B));

	}

	public static int getLeastCommonMultiple(int[] numbers) {
		int result = numbers[0] * numbers[1];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int temp = numbers[i] * numbers[j];
				if (temp <= result) {
					result = temp;
				}
			}
		}

		return result;
	}

}
